package com.in28minutes.IntroductiontoSpringDataRestCreateRESTfulAPIsatF1Speed.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentDataRestRepository repository;
//
//    @GetMapping("/students/{id}")
//    public Student getStudentById(@PathVariable Long id){
//        Optional<Student> student = repository.findById(id);
//        if(student.isPresent()){
//            return student.get();
//        }
//        return student.orElseThrow();
//    }
//
//    @PostMapping("/students")
//    public Student addStudent(@RequestBody  Student student){
//        if(student!=null){
//            return repository.save(student);
//        }
//        return null;
//    }

    @GetMapping("/students/{name}/{passportNumber}")
    public Student findStudentByNameAndPassport(@PathVariable String name, @PathVariable String passportNumber){
        return repository.findByNameOrPassportNumber(name, passportNumber);
    }

}
