package com.example;

public class DepartmentImpl implements Department {
    private String name;
    private String location;
    private Employee employee;

    public DepartmentImpl(String name, String location, Employee employee) {
        this.name = name;
        this.location = location;
        this.employee = employee;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void displayDetails() {
        System.out.println("Department Name:     " + name);
        System.out.println("Department Location: " + location);
        System.out.println("Employee Name:       " + employee.getName());
        System.out.println("Employee ID:         " + employee.getId());
        System.out.println("Employee Department: " + employee.getDepartment());
    }
}