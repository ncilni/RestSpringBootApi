package com.neerajchauhan.springboot.RestSpringBootApi.repository;

import com.neerajchauhan.springboot.RestSpringBootApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}