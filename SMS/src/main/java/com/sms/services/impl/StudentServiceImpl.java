package com.sms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.Entity.Student;
import com.sms.repository.StudentRepository;
import com.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repo;
	
	@Override
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public Student updateStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		repo.deleteById(id);
	}
	

}
