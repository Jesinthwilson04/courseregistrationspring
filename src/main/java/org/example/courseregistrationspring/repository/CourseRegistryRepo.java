package org.example.courseregistrationspring.repository;

import org.example.courseregistrationspring.models.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
