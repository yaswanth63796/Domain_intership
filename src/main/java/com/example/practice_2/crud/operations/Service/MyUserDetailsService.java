package com.example.practice_2.crud.operations.Service;

import com.example.practice_2.crud.operations.Repository.Userrepo;
import com.example.practice_2.crud.operations.model.User;
import com.example.practice_2.crud.operations.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {


    @Autowired
    Userrepo repo;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user=repo.getByEmail(email);

        if(user==null){
            throw new UsernameNotFoundException("Users are not found");
        }


        return new UserPrincipal(user);
    }
}
