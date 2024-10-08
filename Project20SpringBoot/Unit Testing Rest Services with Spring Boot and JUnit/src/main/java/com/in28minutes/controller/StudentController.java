package com.in28minutes.controller;

import com.in28minutes.model.Course;
import com.in28minutes.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class StudentController {
   @Autowired
    private StudentService studentService;

   @GetMapping("/students/{studentId}/courses")
   public List<Course> retrieveCoursesForStudent(@PathVariable String studentId){
       return studentService.retrieveCourses(studentId);
   }

   @GetMapping("/students/{studentId}/courses/{courseId}")
   public Course retriveDetailsForCourse(@PathVariable String studentId, @PathVariable String courseId){
         return studentService.retrieveCourse(studentId,courseId);
   }

   @PostMapping("/students/{studentId}/courses")
    public ResponseEntity<Void> registerStudentForCourse(@PathVariable String studentId, @RequestBody Course course){
            Course courseToAdd = studentService.addCourse(studentId, course);
            if(course==null){
                return ResponseEntity.noContent().build();
            }

       URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
               "/{id}").buildAndExpand(course.getId()).toUri();

            return ResponseEntity.created(location).build();
   }

}
