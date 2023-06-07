package com.example.simpeapp.simpleapp.Document;

import jakarta.persistence.Entity;
import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    Long id;

    @Column(name="student_name")
    String studentName;
    

    
}
