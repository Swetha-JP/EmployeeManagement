package com.example.SpringJPA.Service;

import com.example.SpringJPA.Model.Student;
import com.example.SpringJPA.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo r;

    public List<Student> getStudents() {
        return r.findAll();
    }

    public void addStudents(Student std) {
        r.save(std);
    }
    public Student getStudentByRno(int rno){
        return r.findById(rno).orElse(new Student());
    }

    public void updateStudents(Student std) {
        r.save(std);
    }

    public void deleteStudentsByRoll(int rno) {
        r.deleteById(rno);
    }

    public void deleteAllStudents() {
        r.deleteAll();
    }

    public List<Student> getStudentsByTech(String tech) {
        return r.findByTech(tech);
    }
}
