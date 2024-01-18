package com.yourcompany.admission.service;

import com.yourcompany.admission.model.Student;

import java.util.List;

public interface StudentService {
    String addStudent(Student student, Long courseId);

    List<Student> getAllStudentsForCourse(String courseTitle);

    void cancelStudentAdmission(Long courseId, Long studentId);
}
