package org.example.courseregistrationspring.services;

import org.example.courseregistrationspring.models.Course;
import org.example.courseregistrationspring.models.CourseRegistry;
import org.example.courseregistrationspring.repository.CourseRegistryRepo;
import org.example.courseregistrationspring.repository.Courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    Courserepo courseRepo;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;
    public List<Course> getCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> getReg() {
        return  courseRegistryRepo.findAll();
    }

    public void resisterStdCourse(String name, String emailid, String coursename) {
        Course course = new Course(name,emailid,coursename);
        courseRepo.save(course);
    }
}
