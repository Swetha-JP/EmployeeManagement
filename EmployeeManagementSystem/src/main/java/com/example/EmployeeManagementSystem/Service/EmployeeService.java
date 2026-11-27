package com.example.EmployeeManagementSystem.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    List<com.example.EmployeeManagementSystem.Model.EmployeeModel> list = new ArrayList<>(Arrays.asList(
            new com.example.EmployeeManagementSystem.Model.EmployeeModel(1, "Suji", "IT", 30000),
            new com.example.EmployeeManagementSystem.Model.EmployeeModel(2, "Arun", "HR", 25000),
            new com.example.EmployeeManagementSystem.Model.EmployeeModel(3, "Priya", "Finance", 35000)
    ));

    // READ - Get all employees
    public List<com.example.EmployeeManagementSystem.Model.EmployeeModel> getAllEmployees() {
        return list;
    }

    // CREATE - Add employee
    public void addEmployee(com.example.EmployeeManagementSystem.Model.EmployeeModel e) {
        list.add(e);
    }

    // UPDATE - Update employee
    public void updateEmployee(com.example.EmployeeManagementSystem.Model.EmployeeModel e) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == e.getId()) {
                list.set(i, e);
                return;
            }
        }
    }

    // DELETE - Delete employee
    public void deleteEmployee(int id) {
        list.removeIf(e -> e.getId() == id);
    }

}
