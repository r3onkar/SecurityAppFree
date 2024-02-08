package com.secuirty.services.imple;

import com.secuirty.entity.Student;
import com.secuirty.repository.StudentRepo;
import com.secuirty.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImple implements StudentServices {

	@Autowired
	private StudentRepo studentRepo;


	@Override
	public Student addStudent(Student student) {

		Student save = studentRepo.save(student);

		return save;
	}

	
}
