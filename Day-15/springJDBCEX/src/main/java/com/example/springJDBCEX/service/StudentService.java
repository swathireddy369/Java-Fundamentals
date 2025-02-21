package com.example.springJDBCEX.service;

import com.example.springJDBCEX.model.Student;
import com.example.springJDBCEX.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
  @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void addStudent(Student s) {
        System.out.println("service");
        repo.save(s);
    }

    public void getStudents() {
        repo.findAll();
    }
}
