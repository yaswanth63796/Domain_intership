package com.example.practice_1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student  {

    public void study(){

        System.out.println("iam pursuing engineering");
    }
    public Student(){
        System.out.println("the object created");
    }




}
