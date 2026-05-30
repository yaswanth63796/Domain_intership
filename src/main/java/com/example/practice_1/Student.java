package com.example.practice_1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Student  {

    //Field Injextion
      //@Autowired
      //Pen P;

    /*
    @Autowired
    Pen P;
    public Student(Pen P){
        this.P=P;
    }
*/
    /*
    Pen P;
    @Autowired
    public void  setter(Pen P){
        this.P=P;
    }

     */

    public void study(){

        System.out.println("iam pursuing engineering");
    }

    public void writeexam(){
        P.write();
    }




}
