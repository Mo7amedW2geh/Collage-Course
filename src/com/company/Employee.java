package com.company;

public abstract class Employee {
    private Integer id;
    private String name, email, address;
    protected Float salary;
    public Employee(){

    }
    public Employee(Integer id, String name, String email, Float salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }
    public abstract int x(int y);

    public void raiseSalary(){
        this.salary += this.salary * (7.0f/100);
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", Name: " + name +
                ", Email: " + email +
                ", Salary: " + salary;
    }
}
