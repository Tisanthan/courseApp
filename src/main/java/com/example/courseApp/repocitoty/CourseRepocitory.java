package com.example.courseApp.repocitoty;

import com.example.courseApp.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CourseRepocitory extends JpaRepository<Course, BigInteger> {
}
