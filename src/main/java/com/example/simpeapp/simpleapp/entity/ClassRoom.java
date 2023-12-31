package com.example.simpeapp.simpleapp.entity;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long classId;

    @Column
    @Size(min=1)
    String className;

    @OneToMany(mappedBy = "classRoom")
    @Nullable
    Set<Student> students;

}
