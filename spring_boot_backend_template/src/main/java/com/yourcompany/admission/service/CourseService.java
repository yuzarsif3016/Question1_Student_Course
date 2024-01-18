package com.yourcompany.admission.service;

import com.yourcompany.admission.model.Course;

public interface CourseService {
    String launchNewCourse(Course course);

    String updateCourseFees(Long courseId, int fees);
}
