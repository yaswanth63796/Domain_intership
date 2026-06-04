package com.example.SpringSecurity.Controller;


import com.example.SpringSecurity.Model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class StudentController {

    List<Student>students=new ArrayList<>(
            Arrays.asList(new Student(1,"yaswanth","male","CSE"),new Student(2,"Srinath","male","CSE"))
    );

    @GetMapping("/get")
    List<Student> getallstudent(){
        return students;
    }
    @PostMapping("/add")
    public Student addstudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

    @GetMapping("csrf-token")

    public CsrfToken getCsrftoken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
