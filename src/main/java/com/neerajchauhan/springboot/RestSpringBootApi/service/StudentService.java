package com.neerajchauhan.springboot.RestSpringBootApi.service;

import com.neerajchauhan.springboot.RestSpringBootApi.dto.AddStudentRequestDto;
import com.neerajchauhan.springboot.RestSpringBootApi.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(Long id);
    StudentDto createNewStudentById(AddStudentRequestDto addStudentRequestDto);
    void deleteStudentById(Long id);
    StudentDto updateStudentById(Long id, AddStudentRequestDto addStudentRequestDto);
    StudentDto updatePartialStudent(Long id, Map<String, Object> updates);
}
