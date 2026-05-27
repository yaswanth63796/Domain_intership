package com.example.intership;

public class Course {
    private int    coursecode;
    private String subjectname;
    private int credits;

    public Course(int coursecode, String subjectname, int credits) {
        this.coursecode = coursecode;
        this.subjectname = subjectname;
        this.credits = credits;
    }

    public int  getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(int  coursecode) {
        this.coursecode = coursecode;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
