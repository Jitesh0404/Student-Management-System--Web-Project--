package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.Entity.Student;
import com.sms.repository.StudentRepository;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

	@Autowired
	private StudentRepository repo;
	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student("Jitesh","Sharma","jitesh04sharma@gmail.com");
//		repo.save(s1);
//		Student s2 = new Student("Rakesh","Sharma","rakesh99sharma@gmail.com");
//		repo.save(s2);
//		Student s3 = new Student("Nikita","Choudhary","niki079@gmail.com");
//		repo.save(s3);
//		Student s4 = new Student("Rinku","Sharma","rr05@gmail.com");
//		repo.save(s4);
//		Student s5 = new Student("Ramesh","Sharma","Wanted04@gmail.com");
//		repo.save(s5);
		
	}

}
