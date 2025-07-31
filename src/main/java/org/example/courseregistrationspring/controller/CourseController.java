package org.example.courseregistrationspring.controller;

import org.example.courseregistrationspring.models.Course;
import org.example.courseregistrationspring.models.CourseRegistry;
import org.example.courseregistrationspring.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/courses/registered")
    public List<CourseRegistry> getRegistrations(){
        return courseService.getReg();
    }
    @PostMapping("/register")
    public String registerStdCourses(@RequestParam("name") String name,
                                   @RequestParam("emailid") String emailid,
                                   @RequestParam("coursename") String coursename){
        courseService.registerStdCourse(name,emailid,coursename);

        return "Student name:"+name+",emailid:"+emailid+",coursename:"+coursename+".";
    }
}
