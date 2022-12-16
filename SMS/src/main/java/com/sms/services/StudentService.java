package com.sms.services;

import java.util.List;

import com.sms.Entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);

}
