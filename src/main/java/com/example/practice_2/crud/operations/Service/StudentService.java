package com.example.practice_2.crud.operations.Service;

import com.example.practice_2.crud.operations.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {


    List<Student>students= new ArrayList<>(Arrays.asList(new Student(1,"yaswanth","CSE"),new Student(2,"srinath","CSE")));
    public List<Student> getallstudents() {
         return students;
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;


    }

    public Student getStudentByid(int rno) {

        boolean flag=false;
        for (Student s : students) {
            if (s.getRno() == rno) {
                flag=true;
                return s;

            }
        }


        return null;
    }

    public Student  deletestudentByid(int rno) {

        for(Student s:students){
            if(s.getRno()==rno){
                students.remove(s);
                return s;
            }
        }
        return null;
    }

    public Student updatestudent(int rno, Student updatestudent) {

          for(Student s:students){

              if(s.getRno()==rno){
                  s.setName(updatestudent.getName());
                  s.setTech(updatestudent.getTech());

                  return s;
              }
          }
          return null;
    }
}
