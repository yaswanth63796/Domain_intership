package com.example.SpringSecurity.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
     private int rno;
     private String name;
     private String gender;
     private  String tech;

}
