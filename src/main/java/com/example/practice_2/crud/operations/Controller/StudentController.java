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
    public Student addstudent(@RequestBody Student student){
         s.addstudent(student);
         return student;
    }

    @GetMapping("/get/{rno}")
     public Student getstudentByid(@PathVariable int rno){
        return s.getStudentByid(rno);

    }
   @PutMapping("/update/{rno}")
    public Student updateStudentByid(@PathVariable int rno,@RequestBody Student update){
         return s.updateStudent(rno,update);
   }
   @DeleteMapping("/delete/{rno}")
    public String deletestudentByid(@PathVariable int rno){
         s.deletestudentByid(rno);
         return "deleted sucesfully";
   }
}