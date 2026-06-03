package com.example.practice_2.crud.operations.Service;


import com.example.practice_2.crud.operations.Dto.UserDto;
import com.example.practice_2.crud.operations.Repository.Userrepo;
import com.example.practice_2.crud.operations.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    public UserDto getById(int id) {
        User u1=repo.findById(id).orElse(null);

        return convertStudenttoDto(u1);
    }

    public UserDto convertStudenttoDto(User u1){
        UserDto dto=new UserDto();
        dto.setId(u1.getId());
        dto.setName(u1.getName());
        dto.setGender(u1.getGender());
        dto.setEmail(u1.getEmail());

        return dto;
    }

    public UserDto adduser(UserDto user) {
          repo.save(convertuser(user));
          return user;
    }

    public User convertuser(UserDto user){

         User user1=new User();
         user1.setId(user.getId());
         user1.setEmail(user.getEmail());
         user1.setGender(user.getGender());
         user1.setName(user.getName());
         return user1;

    }

}
