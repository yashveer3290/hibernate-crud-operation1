package com.sunglowsys.service;

import com.sunglowsys.domain.Student;
import com.sunglowsys.repository.StudentRepository;
import com.sunglowsys.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository = new StudentRepositoryImpl();
    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student, Long id) {
        return studentRepository.update(student,id);
    }

    @Override
    public Student findById(Long id) {
        Student student = studentRepository.findById(id);
        return student;
    }

    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    @Override
    public void delete(Long id) {
        studentRepository.delete(id);

    }
}
