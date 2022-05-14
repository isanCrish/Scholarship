package com.faith.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.faith.demo.entity.Student;
import com.faith.demo.service.IStudentService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	public IStudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllDepartment() {
		return studentService.getStudent();
		
	}
	
	

}
