package com.example.practice_2.crud.operations.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private int rno;
    @NotBlank(message = "Name field not be Empty")
    private String name;

    @NotBlank(message="Tech filed not be Empty")
    private String tech;

}
