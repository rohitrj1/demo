package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;

@CrossOrigin("*")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	
	
	@PostMapping("/add")
	public Student adddata(@RequestBody Student student)
	{
		return this.studentService.add(student);
	}
	
	@GetMapping("/get")
	public List<Student> getAll()
	{
		return this.studentService.getAll();
	}
	
	
	
}
