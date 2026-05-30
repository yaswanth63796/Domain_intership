package com.example.practice_1;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component


public class Pencil implements Writer {
    public void write(){
        System.out.println("writing the exam using the pencil");
    }
}
