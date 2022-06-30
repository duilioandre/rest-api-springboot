package com.example.first_demo_spring.student;

public interface StudentMapper<I, O>{
    Student map(StudentDTO in);
}
