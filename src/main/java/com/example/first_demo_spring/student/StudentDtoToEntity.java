package com.example.first_demo_spring.student;

import org.springframework.stereotype.Component;

@Component
public class StudentDtoToEntity implements StudentMapper{

    @Override
    public Student map(StudentDTO in) {
        Student student = new Student();
        student.setNome(in.getNome());
        student.setCognome(in.getCognome());
        student.setEmail(in.getEmail());
        return student;
    }
}
