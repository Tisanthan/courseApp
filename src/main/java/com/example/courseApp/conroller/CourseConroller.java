package com.example.courseApp.conroller;

import com.example.courseApp.entity.Course;
import com.example.courseApp.repocitoty.CourseRepocitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseConroller {
    @Autowired
    private CourseRepocitory courseRepocitory;

    @RequestMapping("/Course")
    public List<Course> getCourses() {
        return courseRepocitory.findAll();
    }
}
