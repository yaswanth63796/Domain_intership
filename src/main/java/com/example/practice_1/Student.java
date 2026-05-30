package com.example.practice_1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student  {

    int age;
    public void study(){

        System.out.println("iam pursuing engineering");
    }
    public Student(){
        System.out.println("the object created");
    }




}
