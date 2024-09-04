package com.in28minutes.CreatingaSOAPWebServicewithSpringBootStarterWebServices.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://in28minutes.com/students", name = "GetStudentDetailsResponse")
public class GetStudentDetailsResponse {


    private StudentDetails studentDetails;

    public GetStudentDetailsResponse() {
    }

    public GetStudentDetailsResponse(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }


    @XmlElement(name="StudentDetails")
    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    public void setStudentDetails(StudentDetails studentDetails) {
        this.studentDetails = studentDetails;
    }

    @Override
    public String toString() {
        return "GetStudentDetailsResponse{" +
                "studentDetails=" + studentDetails +
                '}';
    }
}
