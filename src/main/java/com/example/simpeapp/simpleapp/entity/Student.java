package com.example.simpeapp.simpleapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column(name="student_name")
    @NotBlank(message = "Name of the student cannot be null")
    @Size(min = 3, message = "The name should be minimum of 3 characters")
    String studentName;

    @ManyToOne
    @JoinColumn(name = "classId")
    ClassRoom classRoom;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id",referencedColumnName = "id")
    private Address address;
}
