package org.example.courseregistrationspring.repository;

import org.example.courseregistrationspring.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courserepo extends JpaRepository<Course,String> {
}
