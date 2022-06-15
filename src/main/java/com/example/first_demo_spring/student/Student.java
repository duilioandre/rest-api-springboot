package com.example.first_demo_spring.student;

public class Student {
    private int id_studente;
    private String name;
    private String cognome;
    private String email;

    public Student(int id_studente, String name, String cognome, String email) {
        this.id_studente = id_studente;
        this.name = name;
        this.cognome = cognome;
        this.email = email;
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
