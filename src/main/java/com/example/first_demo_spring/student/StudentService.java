package com.example.first_demo_spring.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentDtoToEntity studentDtoToEntity;
    @Autowired
    public StudentService(StudentRepository studentRepository, StudentDtoToEntity studentDtoToEntity) {
        this.studentRepository = studentRepository;
        this.studentDtoToEntity = studentDtoToEntity;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void postStudent( StudentDTO studentDto) {
        Student student = studentDtoToEntity.map(studentDto);
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
