package org.example.courseregistrationspring.controller;

import org.example.courseregistrationspring.models.Course;
import org.example.courseregistrationspring.models.CourseRegistry;
import org.example.courseregistrationspring.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courseService.getCourses();

    }
    @GetMapping("/courses/regitered")
    public List<CourseRegistry> getRegistrations(){
        return courseService.getReg();
    }
    @PostMapping("/register")

}
