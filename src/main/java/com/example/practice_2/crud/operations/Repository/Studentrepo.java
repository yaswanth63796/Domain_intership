package com.example.practice_2.crud.operations.Repository;

import com.example.practice_2.crud.operations.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Studentrepo extends JpaRepository<Student,Integer> {
    List<Student> findByNameAndTech(String name, String tech);
    List<Student>findByTech(String tech);

      @Query(nativeQuery = true,value="select * from student where name=:name And tech=:tech")
     List<Student>findByNameTech(@Param("name") String name,@Param("tech") String tech);
}
