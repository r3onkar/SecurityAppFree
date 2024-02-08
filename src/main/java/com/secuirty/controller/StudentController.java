package com.secuirty.controller;

import java.util.Optional;

import com.secuirty.services.StudentServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.secuirty.entity.Student;
import com.secuirty.repository.StudentRepo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	private static Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentServices studentServices;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student ) {
		logger.debug("Adding-Account");

		return studentServices.addStudent(student);
	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Student>getStudent(@PathVariable ("id") int urlid){
//		Optional<Student> byId = studentServices.findById(urlid);
//		if (!byId.isPresent()) {
//			return ResponseEntity.noContent().build();
//		}
//
//		return ResponseEntity.ok(byId.get());
//
//	}

	
//	ResponseEntity<Employees> getEmployee(@PathVariable("empno") int empno) {
//
//		Optional<Employees> findById = employeeRepository.findById(empno);
//		if (!findById.isPresent()) {
//			return ResponseEntity.noContent().build();
//		}
//		return ResponseEntity.ok(findById.get());
//	}
	

}
