package com.example.practice_2.crud.operations.Controller;


import com.example.practice_2.crud.operations.Service.StudentService;
import com.example.practice_2.crud.operations.Service.UserService;
import com.example.practice_2.crud.operations.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService s;

    @PostMapping ("/register")
    public User adduser(@RequestBody User user){
         s.adduser(user);
         return user;

    }


    @PostMapping ("/login")
    public String loginuser(@RequestBody User user){
        return s.login(
                user.getEmail(),user.getPassword()
        );
    }
}
