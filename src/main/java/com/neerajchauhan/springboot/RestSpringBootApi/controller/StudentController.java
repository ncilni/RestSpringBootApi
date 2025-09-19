package com.neerajchauhan.springboot.RestSpringBootApi.controller;

import com.neerajchauhan.springboot.RestSpringBootApi.dto.StudentDto;
import com.neerajchauhan.springboot.RestSpringBootApi.entity.Student;
import com.neerajchauhan.springboot.RestSpringBootApi.repository.StudentRepository;
import com.neerajchauhan.springboot.RestSpringBootApi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/students")
    public List<StudentDto> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentDto getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
}
