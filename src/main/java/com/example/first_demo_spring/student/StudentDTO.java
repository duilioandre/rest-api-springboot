package com.example.first_demo_spring.student;

import lombok.Data;

@Data
public class StudentDTO {
    private Long idStudente;
    private String nome;
    private String cognome;
    private String email;
}
