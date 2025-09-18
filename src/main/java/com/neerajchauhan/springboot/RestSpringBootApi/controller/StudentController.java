package com.neerajchauhan.springboot.RestSpringBootApi.controller;

import com.neerajchauhan.springboot.RestSpringBootApi.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(  1L, "Neeraj", "ncilni@gmail.com");
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById() {
        return new StudentDto(  1L, "Neeraj", "ncilni@gmail.com");
    }
}
