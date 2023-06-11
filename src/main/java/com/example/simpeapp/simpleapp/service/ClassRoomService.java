package com.example.simpeapp.simpleapp.service;

import com.example.simpeapp.simpleapp.dto.ClassRoomDTO;
import com.example.simpeapp.simpleapp.entity.ClassRoom;
import com.example.simpeapp.simpleapp.exceptions.CustomExceptions;
import com.example.simpeapp.simpleapp.repository.ClassRoomEntity;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {

    @Autowired
    ClassRoomEntity classRoomEntity;


    public ClassRoom getClassRoomById(Long id) throws CustomExceptions{
        return this.classRoomEntity.findById(id).orElseThrow(CustomExceptions::new);
    }

    public List<ClassRoom> getAllClassRooms() {
        return this.classRoomEntity.findAll();
    }

    public void deleteClassRoom(Long id) {
        this.classRoomEntity.deleteById(id);
    }

    public void deleteAllClassRooms() {
        this.classRoomEntity.deleteAll();
    }

    public ClassRoom saveClassRoom(ClassRoom classRoom) {
        return this.classRoomEntity.save(classRoom);
    }
}
