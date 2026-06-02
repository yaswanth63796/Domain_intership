package com.example.practice_2.crud.operations.Service;


import com.example.practice_2.crud.operations.Repository.Userrepo;
import com.example.practice_2.crud.operations.model.Student;
import com.example.practice_2.crud.operations.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    Userrepo repo;

    public String  registeruser(User user) {
        repo.save(user);

        return "Registered sucessfully";
    }

    public String login(String email, String password) {

         User user=repo.findByemail(email);
         if(user==null){
             return "user not found";
         }
         if(user.getPassword().equals(password)){
             return "user login sucessfully";
         }
         else{
             return "Invalid email or password";
         }
    }


}
