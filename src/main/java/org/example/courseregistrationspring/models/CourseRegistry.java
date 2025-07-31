package org.example.courseregistrationspring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@Entity
public class CourseRegistry {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String emailid;
    private String coursename;
    public CourseRegistry(String name,String emailid,String coursename){
        this.name=name;
        this.emailid=emailid;
        this.coursename=coursename;
    }
    public CourseRegistry(){}


}
