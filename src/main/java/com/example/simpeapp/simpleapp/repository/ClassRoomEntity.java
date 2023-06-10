package com.example.simpeapp.simpleapp.repository;

import com.example.simpeapp.simpleapp.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomEntity extends JpaRepository<ClassRoom, Long> {
}
