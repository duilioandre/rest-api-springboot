package com.example.first_demo_spring.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        123,
                        "mario,",
                        "rossi",
                        "mario@example.it"
                )
        );
    }
}
