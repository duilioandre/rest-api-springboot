package com.example.first_demo_spring.student;

import javax.persistence.*;

@Entity
@Table(name = "studente")
public class Student {
    @Id
    @SequenceGenerator(name = "student_squence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private int id_studente;
    @Column(name = "nome", length = 45, nullable = false)
    private String name;
    @Column(name = "cognome", length = 45, nullable = false)
    private String cognome;
    @Column(name = "email", length = 45, nullable = false)
    private String email;

    public Student(int id_studente, String name, String cognome, String email) {
        this.id_studente = id_studente;
        this.name = name;
        this.cognome = cognome;
        this.email = email;
    }

    public Student() {

    }

    public int getId_studente() {
        return id_studente;
    }

    public void setId_studente(int id_studente) {
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
