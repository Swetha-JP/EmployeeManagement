package com.example.EmployeeManagementSystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeModel {

    private int id;
    private String name;
    private String department;
    private double salary;

}
