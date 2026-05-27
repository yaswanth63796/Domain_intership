package com.example.intership;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.apache.logging.log4j.util.StringBuilders.equalsIgnoreCase;


@RestController
public class CourseController {

 static  List<Course>list=new ArrayList<>();

    static{
        list.add(new Course("101","maths",2));
        list.add(new Course("102","science",3));
        list.add(new Course("103","english",4));
        list.add(new Course("104","tamil",5));
    }

}
