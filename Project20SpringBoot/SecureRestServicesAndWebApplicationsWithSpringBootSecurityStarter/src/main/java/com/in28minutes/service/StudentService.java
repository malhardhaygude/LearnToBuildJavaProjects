package com.in28minutes.service;

import com.in28minutes.Course;
import com.in28minutes.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

	private static List<Student> students = new ArrayList<>();

	static {
		// Initialize Data
		Course course1 = new Course("Course1", "Spring", "10 Steps",
				List.of("Learn Maven", "Import Project", "First Example",
						"Second Example"));
		Course course2 = new Course("Course2", "Spring MVC", "10 Examples",
				List.of("Learn Maven", "Import Project", "First Example",
						"Second Example"));

		Student ranga = new Student("Ranga Karanam","Student1",
				"Hiker, Programmer and Architect", new ArrayList<>(
						List.of(course1, course2)));

		students.add(ranga);
	}

	public Student retrieveStudent(String studentId) {
		for (Student student : students) {
			if (student.getId().equals(studentId)) {
				return student;
			}
		}
		return null;
	}

	public List<Course> retrieveCourses(String studentId) {
		Student student = retrieveStudent(studentId);

		return student == null ? null : student.getCourses();
	
	}
}