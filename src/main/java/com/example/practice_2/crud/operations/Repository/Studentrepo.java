package com.example.practice_2.crud.operations.Repository;

import com.example.practice_2.crud.operations.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Studentrepo extends JpaRepository<Student,Integer> {
    List<Student> findByNameAndTech(String name, String tech);
}
