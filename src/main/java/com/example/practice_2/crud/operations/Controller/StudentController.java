package com.example.practice_2.crud.operations.Controller;


import com.example.practice_2.crud.operations.Service.StudentService;
import com.example.practice_2.crud.operations.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Student")
public class StudentController {

        @Autowired
       StudentService s;


        @GetMapping("/get")
    public List<Student> getallstudents(){
        return s.getallstudents();
    }

    @PostMapping("/add")
     public Student addStudent(@RequestBody Student student){
            return s.addStudent(student);
    }

}
