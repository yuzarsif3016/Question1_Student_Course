package com.yourcompany.admission.dao;

import com.yourcompany.admission.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByTitle(String title);
}
