package com.example.intership;


import org.springframework.stereotype.Component;

@Component
public class Course {
   private String coursecode;
   private String courseName;
   private int credits;

    public Course() {
    }

    public Course(String coursecode, String courseName, int credits) {
        this.coursecode = coursecode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
