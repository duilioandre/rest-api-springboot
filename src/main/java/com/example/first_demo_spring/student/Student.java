package com.example.first_demo_spring.student;

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "studente")
public class Student {
    @Id
    @GeneratedValue
    private Long idStudente;
    @Column(name = "nome", length = 45)
    @NotNull
    private String nome;
    @Column(name = "cognome", length = 45)
    @NotNull
    private String cognome;
    @Column(name = "email", length = 45)
    @NotNull
    private String email;

    public Student() {}

    public Student(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public Long getIdStudente() {
        return idStudente;
    }

    public void setIdStudente(Long idStudente) {
        this.idStudente = idStudente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
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
                "id_studente=" + idStudente +
                ", name='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
