package com.in28minutes.IntroductiontoSpringDataRestCreateRESTfulAPIsatF1Speed.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String passportNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }

    public Student(String name, String passportNumber, Long id) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.id = id;
    }

    public Student() {
    }
}
