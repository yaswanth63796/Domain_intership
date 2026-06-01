package com.example.practice_2.crud.operations.Service;

import com.example.practice_2.crud.operations.model.Student;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {


    List<Student>students= Arrays.asList(new Student(1,"yaswanth","CSE"),new Student(2,"srinath","CSE"));
    public List<Student> getallstudents() {
         return students;
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;


    }
}
