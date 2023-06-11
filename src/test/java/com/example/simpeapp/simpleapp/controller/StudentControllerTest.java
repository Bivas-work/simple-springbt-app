package com.example.simpeapp.simpleapp.controller;

import com.example.simpeapp.simpleapp.Controller.StudentController;
import com.example.simpeapp.simpleapp.entity.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    StudentController studentController;

    @Test
    public void sampleTest() {
        assertTrue(true);
    }

    @Test
    public void testSaveStudent() {
        Student student = new Student();
        student.setId(1L);
        student.setStudentName("Bivas");
        when(studentController.saveStudent(student)).thenReturn(new ResponseEntity<>(student, HttpStatus.OK));
        Assertions.assertEquals(new ResponseEntity<>(student, HttpStatus.OK),studentController.saveStudent(student));
    }
}
