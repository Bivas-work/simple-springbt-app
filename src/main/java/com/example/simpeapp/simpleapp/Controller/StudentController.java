package com.example.simpeapp.simpleapp.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.simpeapp.simpleapp.entity.Student;
import com.example.simpeapp.simpleapp.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody @Valid Student s) {
        return new ResponseEntity<>(studentService.saveStudent(s),HttpStatus.CREATED);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudent (@PathVariable Long id) {
        return new ResponseEntity<>(studentService.getStudentById(id),HttpStatus.OK);
    }

    @GetMapping("/student")
    public ResponseEntity<Student> getStudentByQueryParam (@RequestParam Long id) {
        return new ResponseEntity<>(studentService.getStudentById(id),HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudent () {
        return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
    }

    @PutMapping("/student")
    public ResponseEntity<Student> updateStudent(@Valid @RequestBody Student student) {
        return new ResponseEntity<>(studentService.updateStudent(student),HttpStatus.OK);
    }

    @DeleteMapping("/student")
    public ResponseEntity deleteStudent(@RequestParam Long id) {
        studentService.deleteStudent(id);
        return  new ResponseEntity<>(HttpHeaders.ACCEPT,HttpStatus.OK);
    }

    @DeleteMapping("/students")
    public ResponseEntity deleteAllStudents() {
        studentService.deleteAllStudents();
        return new ResponseEntity(HttpHeaders.ACCEPT,HttpStatus.OK );
    }
    
}
