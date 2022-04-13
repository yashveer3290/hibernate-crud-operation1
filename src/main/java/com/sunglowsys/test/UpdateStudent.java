package com.sunglowsys.test;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepositoryImpl;
import com.sunglowsys.service.StudentService;
import com.sunglowsys.service.StudentServiceImpl;

public class UpdateStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Shyam");
        new StudentRepositoryImpl().update(student,8L);
    }
}
