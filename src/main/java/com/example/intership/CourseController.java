package com.example.intership;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.apache.logging.log4j.util.StringBuilders.equalsIgnoreCase;


@RestController
@RequestMapping("/courses")
public class CourseController {

 static  List<Course>list=new ArrayList<>();

    static{
        list.add(new Course("101","maths",2));
        list.add(new Course("102","science",3));
        list.add(new Course("103","english",4));
        list.add(new Course("104","tamil",5));
    }

@GetMapping()
    public ResponseEntity<List<Course>>getallcourses(){
         return ResponseEntity.ok(list);
}

@GetMapping("/getcourse/{code}")
public ResponseEntity<Course>getcourse(@PathVariable String code){


        for(Course C:list){
            if(C.getCoursecode().equals(code)){
                return ResponseEntity.ok(C);
            }
        }
        return ResponseEntity.notFound().build();
}
@PostMapping("/add")
    public ResponseEntity<Course>addCourse(@RequestBody Course course){
        list.add(course);
        return ResponseEntity.ok(course);
}
@DeleteMapping("/delete/{code}")
    public ResponseEntity<Course>deletecourses(@PathVariable String  code){

        for(Course C:list){
            if(C.getCoursecode().equals(code)){
                list.remove(C);
                return ResponseEntity.ok(C);
            }
        }
 return ResponseEntity.notFound().build();
}

@PutMapping("/update/{code}")
    public ResponseEntity<Course>updatecourse(@PathVariable String code,@RequestBody Course updatecourse){

        for(Course c:list){
            if(c.getCoursecode().equals(code)){
                c.setCourseName(updatecourse.getCourseName());
                c.setCredits((updatecourse.getCredits()));
                return ResponseEntity.ok(c);
            }

        }
        return ResponseEntity.notFound().build();
}
}
