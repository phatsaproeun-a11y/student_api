package com.example.demo.service;

import com.example.demo.model.entity.Students;
import com.example.demo.model.request.StudentRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    List<Students> getAllStudents();

     Students createStudent(StudentRequest studentRequest);
}
