package com.example.practice_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Practice1Application {

	public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(Practice1Application.class, args);
        Student S=context.getBean(Student.class);
        S.study();
	}


}
