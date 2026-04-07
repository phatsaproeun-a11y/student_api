package com.example.demo.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
//@RequiredArgsConstructor

public class StudentRequest {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final String email;

}
