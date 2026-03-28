package com.example;

public class EmployeeImpl implements Employee {
    private String name;
    private int id;
    private String department;

    public EmployeeImpl(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getDepartment() {
        return department;
    }
}