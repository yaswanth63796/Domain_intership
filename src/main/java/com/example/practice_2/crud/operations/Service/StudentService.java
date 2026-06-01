package com.example.practice_2.crud.operations.Service;

import com.example.practice_2.crud.operations.Repository.Studentrepo;
import com.example.practice_2.crud.operations.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

     @Autowired
    Studentrepo repo;
    public List<Student> getallstudents() {
        return repo.findAll();
    }


    public  Student  addstudent(Student student) {
       return repo.save(student);

    }

    public Student getStudentByid(int rno) {

        return repo.findById(rno).orElse(null);
    }


    public Student updateStudent(int rno,Student update) {
        Student existingStudent = repo.findById(rno).orElse(null);
        if(existingStudent!=null){
            existingStudent.setName(update.getName());
            existingStudent.setTech(update.getTech());
            return existingStudent;
        }
        return null;

    }

    public String deletestudentByid(int rno) {
           if(repo.existsById(rno)) {
               repo.deleteById(rno);
               return "Sucessfully deleted";
           }

           return "student data not found";
    }
}
