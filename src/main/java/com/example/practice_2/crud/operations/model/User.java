package com.example.practice_2.crud.operations.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
      @Id

      private   Integer id;
      private String name;
      private String email;
      private String gender;
      private String  password;
}
