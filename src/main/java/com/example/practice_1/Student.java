package com.example.practice_1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Student  {

    @Autowired
    @Qualifier("pencil")
    Writer W;


    public void study(){

        System.out.println("iam pursuing engineering");
    }

    public void writeexam(){
        W.write();
    }




}
