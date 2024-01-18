package com.yourcompany.admission.service.impl;

import com.yourcompany.admission.dao.CourseRepository;
import com.yourcompany.admission.dao.StudentRepository;
import com.yourcompany.admission.model.Course;
import com.yourcompany.admission.model.Student;
import com.yourcompany.admission.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String addStudent(Student student, Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new NoSuchElementException("Course not found"));

        if (student.getScore() >= course.getMinScore()) {
            student.setCourse(course);
            studentRepository.save(student);
            return "Student added successfully";
        } else {
            return "Admission not granted due to low score";
        }
    }

    @Override
    public List<Student> getAllStudentsForCourse(String courseTitle) {
        return studentRepository.findByCourseTitle(courseTitle);
    }

    @Override
    public void cancelStudentAdmission(Long courseId, Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
