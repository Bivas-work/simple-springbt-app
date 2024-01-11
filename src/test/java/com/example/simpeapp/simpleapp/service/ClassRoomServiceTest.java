package com.example.simpeapp.simpleapp.service;

import com.example.simpeapp.simpleapp.dto.ClassRoomDTO;
import com.example.simpeapp.simpleapp.entity.ClassRoom;
import com.example.simpeapp.simpleapp.entity.Student;
import com.example.simpeapp.simpleapp.exceptions.CustomExceptions;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ClassRoomServiceTest  {

    @Autowired
    ClassRoomService classRoomService;

    ClassRoomDTO classRoomDTO;
    ClassRoom classRoom = new ClassRoom();

    @BeforeEach
    public void saveOneClass(){
        classRoom.setClassName("Computers Major");
        classRoom.setStudents(new HashSet<Student>());
        classRoom = classRoomService.saveClassRoom(classRoom);

    }

    @Test
    public void testGetAllClassRooms() {
        assertNotNull(classRoomService.getAllClassRooms());
    }

    @Test
    @Transactional
    public void testGetClassRoomById() throws CustomExceptions {
        Assertions.assertEquals(this.classRoom,this.classRoomService.getClassRoomById(this.classRoom.getClassId()));
    }

    @Test
    @Transactional
    public void testSaveClassRoom() {
        classRoom.setClassName("Computers Minor");
        classRoom.setStudents(new HashSet<Student>());
        classRoom = classRoomService.saveClassRoom(classRoom);
        Assertions.assertEquals(classRoom,this.classRoomService.saveClassRoom(classRoom));
    }

    @Test
    public void testDeleteClassRoom() throws CustomExceptions {
        this.classRoomService.deleteClassRoom(this.classRoom.getClassId());
        Assertions.assertThrows(CustomExceptions.class,()-> {
            this.classRoomService.getClassRoomById(this.classRoom.getClassId());
        });
    }




}
