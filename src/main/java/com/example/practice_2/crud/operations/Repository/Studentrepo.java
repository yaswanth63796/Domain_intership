package com.example.practice_2.crud.operations.Repository;

import com.example.practice_2.crud.operations.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student,Integer> {

}
