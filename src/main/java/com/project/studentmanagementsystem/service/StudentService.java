package com.project.studentmanagementsystem.service;

import com.project.studentmanagementsystem.model.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
   void  saveStudent(Student student);
   
  public Student getStudentById(Long id);
 public  Student updateStudent(Student student);
   void   deleteStudentById(Long id);

    }

