package com.example.demo.conrtroller;

import com.example.demo.model.entity.Students;
import com.example.demo.model.request.StudentRequest;
import com.example.demo.model.respnone.ApiRespnone;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<ApiRespnone> getAllStudents(){
        List<Students> students = studentService.getAllStudents();
        return ResponseEntity.ok(
                new ApiRespnone("Get all students successfully", students, HttpStatus.OK.value())
        );
    }

    @PostMapping
    public ResponseEntity<ApiRespnone> createStudent(@RequestBody StudentRequest studentRequest){
        Students student = studentService.createStudent(studentRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(
                new ApiRespnone("Student created successfully", List.of(student), HttpStatus.CREATED.value())
        );
    }

}