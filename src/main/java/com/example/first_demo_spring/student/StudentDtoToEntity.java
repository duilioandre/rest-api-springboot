package com.example.first_demo_spring.student;

import org.springframework.stereotype.Component;

@Component
public class StudentDtoToEntity implements StudentMapper<StudentDTO, Student> {
//    public StudentDTO convertEntityToDto(Student student) {
//        ModelMapper modelMapper = new ModelMapper();
//        StudentDTO studentDTO = modelMapper.map(student, StudentDTO.class);
//        return studentDTO;
//    }
//
//    public Student convertDtoToEntity(StudentDTO studentDTO) {
//        ModelMapper modelMapper = new ModelMapper();
//        Student student = modelMapper.map(studentDTO, Student.class);
//        return student;
//    }

    @Override
    public Student map(StudentDTO in) {
        Student student = new Student();
        student.setNome(in.getNome());
        student.setCognome(in.getCognome());
        student.setEmail(in.getEmail());
        return student;
    }
}
