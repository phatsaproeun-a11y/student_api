package com.example.demo.repository;


import com.example.demo.model.entity.Students;
import  org.apache.ibatis.annotations.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface StudentRepo {
    @Results ( id ="StudentMapper", value = {
        @Result(property = "id", column = "id"),
        @Result (property = "firstName", column ="first_name"),
        @Result (property = "lastName", column ="last_name"),
        @Result (property = "email", column = "email")
    })

    @Select ("SELECT * FROM students")
    List<Students> getALLStudents();

    @Insert  ("INSERT INTO students ( first_name, last_name,email) VALUES (#{req.firstName},#{req.lastName},#{req.email})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createStudent(@Param("req") Students students);

}
