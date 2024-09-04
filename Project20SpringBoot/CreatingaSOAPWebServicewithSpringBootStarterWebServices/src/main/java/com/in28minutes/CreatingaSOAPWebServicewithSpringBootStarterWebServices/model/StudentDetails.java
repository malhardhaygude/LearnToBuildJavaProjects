package com.in28minutes.CreatingaSOAPWebServicewithSpringBootStarterWebServices.model;

public class StudentDetails {
  private Long id;
  private String name;
  private String passportNumber;

  public StudentDetails() {
  }

  public StudentDetails(Long id, String name, String passportNumber) {
    this.id = id;
    this.name = name;
    this.passportNumber = passportNumber;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  @Override
  public String toString() {
    return "StudentDetails{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", passportNumber='" + passportNumber + '\'' +
            '}';
  }
}