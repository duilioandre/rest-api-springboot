package com.example.first_demo_spring.student;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "studente")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_studente;
    @Column(name = "nome", length = 45, nullable = false)
    @NotNull
    private String name;
    @Column(name = "cognome", length = 45, nullable = false)
    @NotNull
    private String cognome;
    @Column(name = "email", length = 45, nullable = false)
    @NotNull
    private String email;

    public Student(String nome, String cognome, String email) {
    }

    public Student() {}

    public Long getId_studente() {
        return id_studente;
    }

    public void setId_studente(Long id_studente) {
        this.id_studente = id_studente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id_studente=" + id_studente +
                ", name='" + name + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
