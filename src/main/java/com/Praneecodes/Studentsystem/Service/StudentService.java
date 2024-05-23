package com.Praneecodes.Studentsystem.Service;

import java.util.List;

import com.Praneecodes.Studentsystem.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
