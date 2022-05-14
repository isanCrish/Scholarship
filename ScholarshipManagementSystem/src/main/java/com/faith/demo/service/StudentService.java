package com.faith.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.demo.dao.IStudent;
import com.faith.demo.entity.Student;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	private IStudent studentRepo;

	@Override
	public List<Student> getStudent() {
		
		return (List<Student>) studentRepo.findAll();
	}

}
