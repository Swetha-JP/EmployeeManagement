package com.example.EmployeeManagementSystem.Controller;

import com.example.EmployeeManagementSystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService s;

    // READ
    @GetMapping("/employees")
    public List<com.example.EmployeeManagementSystem.Model.EmployeeModel> getAllEmployees() {
        return s.getAllEmployees();
    }

    // CREATE
    @PostMapping("/employees")
    public void addEmployee(@RequestBody com.example.EmployeeManagementSystem.Model.EmployeeModel e) {
        s.addEmployee(e);
    }

    // UPDATE
    @PutMapping("/employees")
    public void updateEmployee(@RequestBody com.example.EmployeeManagementSystem.Model.EmployeeModel e) {
        s.updateEmployee(e);
    }

    // DELETE
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        s.deleteEmployee(id);
    }
}
