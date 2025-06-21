package com.studentapi.student;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private Integer age;

    @Column(name = "dob")
    private LocalDate dob;

    public Student() {

    }

    public Student(Integer id, String name, String email, Integer age, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return java.util.Objects.equals(id, student.id) &&
                java.util.Objects.equals(name, student.name) &&
                java.util.Objects.equals(email, student.email) &&
                java.util.Objects.equals(age, student.age) &&
                java.util.Objects.equals(dob, student.dob);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, name, email, age, dob);
    }
}
