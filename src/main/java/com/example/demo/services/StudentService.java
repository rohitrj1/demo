package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	
	// handler 
	
	
	// add data
	
	public Student add(Student student)
	{
		return this.studentRepo.save(student);
	}
	
	
	//get data
	public List<Student> getAll()
	{
		return this.studentRepo.findAll();
	}

}
