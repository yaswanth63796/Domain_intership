package com.example.practice_2.crud.operations.Controller;


import com.example.practice_2.crud.operations.Service.StudentService;
import com.example.practice_2.crud.operations.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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


    @GetMapping("/custom/get")
    public List<Student> getstudentbytechandname(@Param("name") String name, @Param("tech")String tech){
        return s.getbynametech(name,tech);



    }

    @GetMapping("/custom/{tech}")
    public List<Student>getstudentbytech(@PathVariable String tech){

        return s.getstudentbytech(tech);

    }

    @PostMapping("/custom/filter")

    public List<Student>getstudentbytechname(
            @Param("name") String name,@Param("tech") String tech
    ){

         return s.getstudentbytechandname(name,tech);
    }


}