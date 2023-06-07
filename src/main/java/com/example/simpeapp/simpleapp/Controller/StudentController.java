package com.example.simpeapp.simpleapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.simpeapp.simpleapp.Document.Student;
import com.example.simpeapp.simpleapp.service.StudentService;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student s) {
        return studentService.saveStudent(s);
    }

    @GetMapping("/student/{id}")
    public Student getStudent (@PathVariable Long id) { return studentService.getStudentById(id);}

    @GetMapping("/student")
    public Student getStudentByQueryParam (@RequestParam Long id) { return studentService.getStudentById(id);}

    @GetMapping("/students")
    public List<Student> getStudent () { return studentService.getAllStudents();}
    
}
