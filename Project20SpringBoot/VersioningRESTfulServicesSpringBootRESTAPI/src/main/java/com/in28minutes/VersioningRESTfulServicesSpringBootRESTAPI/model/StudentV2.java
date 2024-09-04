package com.in28minutes.VersioningRESTfulServicesSpringBootRESTAPI.model;

public class StudentV2 {
  private Name name;

  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public StudentV2(Name name) {
    this.name = name;
  }

  public StudentV2() {
  }
}