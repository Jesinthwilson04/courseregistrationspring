package org.example.courseregistrationspring.services;

import org.example.courseregistrationspring.models.Course;
import org.example.courseregistrationspring.repository.Courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    Courserepo courseRepo;
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }
}
