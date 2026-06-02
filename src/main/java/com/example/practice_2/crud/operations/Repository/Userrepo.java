package com.example.practice_2.crud.operations.Repository;

import com.example.practice_2.crud.operations.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepo  extends JpaRepository<User,Integer> {

     User findByemail(String  email);
}
