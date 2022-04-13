package com.sunglowsys.test;

import com.sunglowsys.service.StudentServiceImpl;

public class StudentDeleteById {
    public static void main(String[] args) {

        new StudentServiceImpl().delete(1L);
    }
}
