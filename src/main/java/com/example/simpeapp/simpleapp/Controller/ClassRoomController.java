package com.example.simpeapp.simpleapp.Controller;

import com.example.simpeapp.simpleapp.dto.ClassRoomDTO;
import com.example.simpeapp.simpleapp.entity.ClassRoom;
import com.example.simpeapp.simpleapp.exceptions.CustomExceptions;
import com.example.simpeapp.simpleapp.service.ClassRoomService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClassRoomController {

    @Autowired
    ClassRoomService classRoomService;

    @PostMapping("/class-room")
    public ResponseEntity<ClassRoom> saveClassRoom(@RequestBody @Valid ClassRoom c) {
        return new ResponseEntity<>(classRoomService.saveClassRoom(c),HttpStatus.OK);
    }

    @GetMapping("/class-room/{id}")
    public ResponseEntity<ClassRoom> getClassRoom (@PathVariable Long id) throws CustomExceptions {
        return new ResponseEntity<>(classRoomService.getClassRoomById(id),HttpStatus.OK);
    }

    @GetMapping("/class-room")
    public ResponseEntity<ClassRoom> getClassRoomByQueryParam (@RequestParam Long id) throws CustomExceptions {
        return new ResponseEntity<>(classRoomService.getClassRoomById(id),HttpStatus.OK);
    }

    @GetMapping("/class-rooms")
    public ResponseEntity<List<ClassRoom>> getClassRoom () {
        return new ResponseEntity<>(classRoomService.getAllClassRooms(),HttpStatus.OK);
    }

    @PutMapping("/class-room")
    public ResponseEntity<ClassRoom> updateClassRoom(@Valid @RequestParam ClassRoom ClassRoom) {
        return new ResponseEntity<>(classRoomService.saveClassRoom(ClassRoom),HttpStatus.OK);
    }

    @DeleteMapping("/class-room")
    public ResponseEntity deleteClassRoom(@RequestParam Long id) {
        classRoomService.deleteClassRoom(id);
        return  new ResponseEntity<>(HttpHeaders.ACCEPT,HttpStatus.OK);
    }

    @DeleteMapping("/class-rooms")
    public ResponseEntity deleteAllClassRooms() {
        classRoomService.deleteAllClassRooms();
        return new ResponseEntity(HttpHeaders.ACCEPT,HttpStatus.OK );
    }
}
