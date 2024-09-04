package com.in28minutes.CreatingaSOAPWebServicewithSpringBootStarterWebServices.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://in28minutes.com/students", name = "GetStudentDetailsRequest")
public class GetStudentDetailsRequest {


    private Long id;


    public GetStudentDetailsRequest() {
    }

    public GetStudentDetailsRequest(Long id) {
        this.id = id;

    }

    @XmlElement(name="id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GetStudentDetailsRequest{" +
                "id=" + id +
                '}';
    }
}
