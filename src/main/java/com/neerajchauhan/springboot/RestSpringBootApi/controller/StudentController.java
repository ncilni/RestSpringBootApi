package com.neerajchauhan.springboot.RestSpringBootApi.controller;

import com.neerajchauhan.springboot.RestSpringBootApi.dto.AddStudentRequestDto;
import com.neerajchauhan.springboot.RestSpringBootApi.dto.StudentDto;
import com.neerajchauhan.springboot.RestSpringBootApi.service.StudentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDto> createNewStudentById(@RequestBody @Valid AddStudentRequestDto addStudentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudentById(addStudentRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public  ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody AddStudentRequestDto addStudentRequestDto){
        return ResponseEntity.ok(studentService.updateStudentById(id, addStudentRequestDto));
    }

    @PatchMapping("/{id}")
    public  ResponseEntity<StudentDto> updatePartialStudent(@PathVariable Long id, @RequestBody Map<String, Object> updates){
        return ResponseEntity.ok(studentService.updatePartialStudent(id, updates));
    }
}
