package com.example.simpeapp.simpleapp.service;

import com.example.simpeapp.simpleapp.entity.ClassRoom;
import com.example.simpeapp.simpleapp.repository.ClassRoomEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomService {

    @Autowired
    ClassRoomEntity classRoomEntity;
    public ClassRoom getClassRoomById(Long id) {
        return this.classRoomEntity.findById(id).orElse(new ClassRoom());
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
