package com.example.SpringJPA.Controller;

import com.example.SpringJPA.Model.Student;
import com.example.SpringJPA.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService s;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return s.getStudents();
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student std){
        s.addStudents(std);
        return "success";
    }

    @GetMapping("student/{rno}")
    public Student getStudent(@PathVariable("rno") int rno){
        return s.getStudentByRno(rno);
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student std){
        s.updateStudents(std);
        return "updated";
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudentByRoll(@PathVariable("rno") int rno){
        s.deleteStudentsByRoll(rno);
        return "deleted";
    }

    @DeleteMapping("students/clear")
    public String deleteAllStudents(){
        s.deleteAllStudents();
        return "Fully deleted";
    }
    @GetMapping("students/technology/{tech}")
    public List<Student> getStudentsByTechnology(@PathVariable("tech") String tech){
        return s.getStudentsByTech(tech);
    }

}
