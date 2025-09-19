package com.neerajchauhan.springboot.RestSpringBootApi.dto;

import lombok.Data;

@Data
public class AddStudentRequestDto {
    private String name;
    private String email;
}
