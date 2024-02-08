package com.secuirty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secuirty.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
