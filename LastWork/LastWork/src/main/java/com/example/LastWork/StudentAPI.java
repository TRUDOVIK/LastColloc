package com.example.LastWork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class StudentAPI {

	private List<Student> students = new ArrayList<>();
	private List<Grade> grades = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(StudentAPI.class, args);
	}

	// Получение списка всех студентов
	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}

	// Добавление нового студента
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}

	// Получение оценок конкретного студента
	@GetMapping("/grades/{studentId}")
	public List<Grade> getGrades(@PathVariable int studentId) {
		List<Grade> studentGrades = new ArrayList<>();
		for (Grade grade : grades) {
			if (grade.getStudentId() == studentId) {
				studentGrades.add(grade);
			}
		}
		return studentGrades;
	}

	// Выставление оценки студенту
	@PostMapping("/grades")
	public Grade addGrade(@RequestBody Grade grade) {
		grades.add(grade);
		return grade;
	}
}


