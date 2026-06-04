package com.example.SpringSecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Hellocontroller {


    @GetMapping("/")
    public String homepage(HttpServletRequest request){

        return "it is a homepage"+" "+ "Session Id:"+request.getSession().getId();
    }

    @GetMapping("/about")
    public String aboutpage(){
        return "it is a aboutpage";
    }
}
