package com.example.SpringSecurity.Config;

import jakarta.websocket.Session;
import org.apache.coyote.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
         http.csrf(Customizer->Customizer.disable());//csrf disable
         http.authorizeHttpRequests(Request->Request.anyRequest().authenticated()); //authorize any http requests
         http.formLogin(Customizer.withDefaults());  //gives login to browser
         http.httpBasic(Customizer.withDefaults());  //gives suthentication to postman
         http.sessionManagement(Session->Session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));  //each time it creates session Id
        return http.build();
    }
}
