package com.in28minutes.VersioningRESTfulServicesSpringBootRESTAPI.controller;

import com.in28minutes.VersioningRESTfulServicesSpringBootRESTAPI.model.Name;
import com.in28minutes.VersioningRESTfulServicesSpringBootRESTAPI.model.StudentV1;
import com.in28minutes.VersioningRESTfulServicesSpringBootRESTAPI.model.StudentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControllerApiVersioning {

    @GetMapping("v1/student")
    public StudentV1 getStudentV1(){
        return new StudentV1("Malhar Dhaygude");
    }

    @GetMapping("v2/student")
    public StudentV2 getStudentV2(){
        return new StudentV2(new Name("Malhar", "Dhaygude"));
    }

    @GetMapping(value="student/param", params = "v1")
    public StudentV1 paramV1(){
        return new StudentV1("Malhar Dhaygude");
    }

    @GetMapping(value="student/param", params = "v2")
    public StudentV2 paramV2(){
        return new StudentV2(new Name("Malhar", "Dhaygude"));
    }

    @GetMapping(value="student/header", headers = "X-API-VERSION=1")
    public StudentV1 headerV1(){
        return new StudentV1("Malhar Dhaygude");
    }

    @GetMapping(value="student/header", headers = "X-API-VERSION=2")
    public StudentV2 headerV2(){
        return new StudentV2(new Name("Malhar", "Dhaygude"));
    }

    @GetMapping(value = "/student/produces", produces = "application/md.company.app-v1+json")
    public StudentV1 producesV1() {
        return new StudentV1("Bob Charlie");
    }

    @GetMapping(value="student/produces", produces="application/md.company.app-v2+json")
    public StudentV2 producesV2(){
        return new StudentV2(new Name("Malhar","Dhaygude"));
    }
}
