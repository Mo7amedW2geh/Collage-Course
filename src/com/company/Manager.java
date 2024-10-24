package com.company;

public abstract class Manager extends Employee {
    private String department;

    public Manager() {
    }
    public Manager(Integer id, String name, String email, Float salary, String department) {
        super(id, name, email, salary);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void raiseSalary() {
        super.salary += super.salary * (15.0f/100);
    }

    @Override
    public String toString() {
        return super.toString() + ", department: " + department;
    }

}
