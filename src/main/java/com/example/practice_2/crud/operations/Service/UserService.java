package com.example.practice_2.crud.operations.Service;


import com.example.practice_2.crud.operations.Repository.Userrepo;
import com.example.practice_2.crud.operations.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    Userrepo repo;

     public User adduser(User user){
        return repo.save(user);
     }

    public String login(String email,String password) {
         User user=repo.findByEmail(email);
          if(user==null){
            return  " user not found";
          }
         if(user.getPassword().equals(password)){
             return "user login sucesfully";
         }

       else{
          return "invalid email or password";
          }
    }
}
