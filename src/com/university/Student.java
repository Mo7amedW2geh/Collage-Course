package com.university;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int id;
    private String name, address, email;
    private Date birthDate;

    static private String universityName;
    static private int numberOfStudents;
    static private final String nationality = "EGYPTIAN";
    static private Student[] students = new Student[1000];
    public Student(int id, String name, String address, String email, Date birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.birthDate = birthDate;
        students[numberOfStudents] = this;
        numberOfStudents++;
    }

    static{
        universityName = "Fayoum University";
        numberOfStudents =  0;
    }

    public static String getUniversityName() {
        return universityName;
    }

    public static Student[] getStudents() {
        return students;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static  String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ",Name: " + name +
                ",Email: " + email +
                ",Address: " + address +
                ",Date of birth: " + new SimpleDateFormat("dd/MMM/yy").format(birthDate) +
                ",Nationality: " + getNationality();

    }

    public static void main(String[] args){
        Student s1 = new Student(1, "Ahmed Ali", "Fayoum-Egypt", "ahmed@fym.eg", new Date("09/05/2000"));
        Student s2 = new Student(2, "Sara Hussein", "Cairo Egypt", "sara@cairo.eg", new Date("09/12/1999"));

        System.out.println("Number of students: " + Student.getNumberOfStudents());
        for(Student s: Student.getStudents()){
            if( s != null)
                System.out.println(s);
        }
    }
}
