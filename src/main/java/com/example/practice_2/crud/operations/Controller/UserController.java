package com.example.practice_2.crud.operations.Controller;


import com.example.practice_2.crud.operations.Service.StudentService;
import com.example.practice_2.crud.operations.Service.UserService;
import com.example.practice_2.crud.operations.model.Student;
import com.example.practice_2.crud.operations.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService s;

      @PostMapping("/register")
    public User registeruser(@RequestBody User user){
           s.registeruser(user);
           return user;
      }

      @PostMapping("/login")
    public String loginuuser(@RequestBody User  user){

          return s.login(
                  user.getEmail(),
                  user.getPassword()
          );
      }


}
