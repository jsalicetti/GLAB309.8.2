package com.lewis.studentlogin.service;

import com.lewis.studentlogin.dto.StudentDto;
import com.lewis.studentlogin.model.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(StudentDto studentDto);
    Student findStudentByEmail(String email);
    List<StudentDto> findAllStudents();
}
