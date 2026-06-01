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
    public List<Student> getallstudents() {
        return s.getallstudents();
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        s.addStudent(student);
        return "sucesss";
    }

    @GetMapping("search/{rno}")

    public Student getStudentByid(@PathVariable int rno) {
        return s.getStudentByid(rno);
    }

    @DeleteMapping("/delete/{rno}")
    public String deletestudentByid(@PathVariable int rno) {
        s.deletestudentByid(rno);
        return "sucesfully deleted";
    }

    @PutMapping("/update/{rno}")
    public Student updatestudentByid(@PathVariable int rno, @RequestBody Student updatestudent) {

        return s.updatestudent(rno, updatestudent);

    }
}