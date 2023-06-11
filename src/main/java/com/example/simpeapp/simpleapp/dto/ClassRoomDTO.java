package com.example.simpeapp.simpleapp.dto;

import com.example.simpeapp.simpleapp.entity.ClassRoom;
import com.example.simpeapp.simpleapp.entity.Student;
import lombok.Data;

import java.util.Set;

@Data
public class ClassRoomDTO {

    private Long classId;

    private String className;

    private Set<Student> students;

    ClassRoomDTO(ClassRoom classRoom) {
        this.classId = classRoom.getClassId();
        this.className = classRoom.getClassName();
        this.students = classRoom.getStudents();
    }
}
