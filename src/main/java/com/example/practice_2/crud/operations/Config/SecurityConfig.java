package com.example.practice_2.crud.operations.Config;

import jakarta.websocket.Session;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Autowired
    UserDetailsService service;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        http.csrf(Customizer->Customizer.disable());//csrf disable
        http.authorizeHttpRequests(Request->Request.anyRequest().authenticated()); //authorize any http requests
//         http.formLogin(Customizer.withDefaults());  //gives login to browser
        http.httpBasic(Customizer.withDefaults());  //gives suthentication to postman
        http.sessionManagement(Session->Session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));  //each time it creates session Id
        return http.build();
    }




    @Bean
    public AuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(service);

        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());


        return provider;
    }
}
