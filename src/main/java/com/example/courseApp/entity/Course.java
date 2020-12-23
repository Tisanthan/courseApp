package com.example.courseApp.entity;

// import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Course {
    @Id
    private BigInteger courseId;
    private String courseName;
    private String courseAuthor;

    public Course() {
    }

    public BigInteger getCourseId() {
        return courseId;
    }

    public void setCourseId(BigInteger courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAuthor() {
        return courseAuthor;
    }

    public void setCourseAuthor(String courseAuthor) {
        this.courseAuthor = courseAuthor;
    }
}
