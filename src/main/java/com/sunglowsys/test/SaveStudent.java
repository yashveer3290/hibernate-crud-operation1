package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.service.StudentService;
import com.sunglowsys.service.StudentServiceImpl;

public class SaveStudent {
    public static void main(String[] args) {

        Student student = new Student("Amit","Kumar","ao011@gmail.com","9887789877");
        StudentService studentService = new StudentServiceImpl();
        Student result = studentService.save(student);
        System.out.println(result);
    }
}
