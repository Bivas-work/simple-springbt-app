package com.example.simpeapp.simpleapp.repository;

import com.example.simpeapp.simpleapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
