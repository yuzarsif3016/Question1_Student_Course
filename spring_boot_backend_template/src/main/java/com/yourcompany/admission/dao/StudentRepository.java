package com.yourcompany.admission.dao;

import com.yourcompany.admission.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByCourseTitle(String title);
}
