package com.example.simpeapp.simpleapp.service;

import com.example.simpeapp.simpleapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.simpeapp.simpleapp.entity.Student;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
     public Student saveStudent(Student s) {
        return studentRepository.save(s);
     }

     public Student getStudentById(Long id) {
         Optional<Student> student = studentRepository.findById(id);
         return student.isPresent()? student.get(): null;
     }

    public List<Student> getAllStudents() {
         return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
         return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
         studentRepository.deleteById(id);
    }

    public void deleteAllStudents() {
         studentRepository.deleteAll();
    }
}
