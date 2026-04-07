package com.example.demo.service.Imp;

import com.example.demo.model.entity.Students;
import com.example.demo.repository.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentServiceImp {
    private final StudentRepo studentRepo;

    List<Students> getAllStudents(){
        return studentRepo.getALLStudents();
    }

    public Students createStudent(Students students){
        studentRepo.createStudent(students);
        return students;
    }

}
