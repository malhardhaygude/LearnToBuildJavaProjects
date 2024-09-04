package com.in28minutes.VersioningRESTfulServicesSpringBootRESTAPI.model;

public class StudentV1 {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StudentV1(String name) {
    this.name = name;
  }

  public StudentV1() {
  }
}