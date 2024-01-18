package com.yourcompany.admission.service.impl;

import com.yourcompany.admission.dao.CourseRepository;
import com.yourcompany.admission.model.Course;
import com.yourcompany.admission.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public String launchNewCourse(Course course) {
        courseRepository.save(course);
        return "New course launched successfully";
    }

    @Override
    public String updateCourseFees(Long courseId, int fees) {
        Course existingCourse = courseRepository.findById(courseId)
                .orElseThrow(() -> new NoSuchElementException("Course not found"));
        existingCourse.setFees(fees);
        courseRepository.save(existingCourse);
        return "Course fees updated successfully";
    }
}
