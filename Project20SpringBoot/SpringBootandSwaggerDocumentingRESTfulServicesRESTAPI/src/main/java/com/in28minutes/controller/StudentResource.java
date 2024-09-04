package com.in28minutes.controller;

import com.in28minutes.exception.StudentNotFoundException;
import com.in28minutes.model.Student;
import com.in28minutes.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentResource {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> retriveAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable long id) throws StudentNotFoundException {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isEmpty())
            throw new StudentNotFoundException("id-" + id);
        return student.get();
    }



    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentRepository.deleteById(id);
    }

    @PostMapping("/students")
    public ResponseEntity<Object> addStudent(@Valid @RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedStudent.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@Valid @RequestBody Student student,
												 @PathVariable long id){
		Optional<Student> studentToUpdate = studentRepository.findById(id);

		if(studentToUpdate.isEmpty())
			return ResponseEntity.notFound().build();

//		student.setId(id);
		studentRepository.save(student);
		return ResponseEntity.noContent().build();
	}

}