package com.example.OathAuthenctication.Config;


import org.apache.coyote.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        http.authorizeHttpRequests(request->request.requestMatchers("/public").permitAll());
        http.authorizeHttpRequests(requests->requests.anyRequest().authenticated());
        http.oauth2Login(Customizer.withDefaults());


        return http.build();
        /*
        http://localhost:8081/login/oauth2/code/google
         */
    }

}


