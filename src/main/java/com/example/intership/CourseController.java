package com.example.intership;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.apache.logging.log4j.util.StringBuilders.equalsIgnoreCase;


@RestController
@RequestMapping("/courses")
public class CourseController {

    List<Course> list=new ArrayList<>();

    public CourseController(){
        list.add(new Course(101, "Math", 3));
        list.add(new Course(102, "Science", 4));
        list.add(new Course(103, "English", 3));
    }


     @GetMapping
    public List<Course>getallcourses(){
        return list;
     }

     @PostMapping("/add")
    public Course addcourse(@RequestBody Course course){
        list.add(course);
        return course;
     }

     @GetMapping("{coursecode}")
     public Course getcoursebycode(@PathVariable int  coursecode) {

         for (Course c : list) {

             if (c.getCoursecode() == coursecode) {
                 return c;
             }
         }

         return null;
     }


     @DeleteMapping("{coursecode}")
     public void deletecourse(@PathVariable int coursecode){
         for(Course c:list){
             if(c.getCoursecode()==coursecode){
                 list.remove(c);
             }
         }

     }
}
