package com.example.jenkins.jenkinsdemo.entity;

import jakarta.persistence.Entity;

@Entity
public class Student {

    Long id;
    String firstName;

    String lastName;
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public Student(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }



}
