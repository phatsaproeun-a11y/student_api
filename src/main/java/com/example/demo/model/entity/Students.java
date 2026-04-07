package com.example.demo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
//@RequiredArgsConstructor
public class Students {
    private final long id;
    private final String firstName;
    private final String lastName;
    private final String emial;

}
