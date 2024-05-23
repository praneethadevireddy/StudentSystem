package com.Praneecodes.Studentsystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Praneecodes.Studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
