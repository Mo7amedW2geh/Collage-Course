package com.university;

import java.util.Date;

public class SpecificStudent extends Student{

    private int IQScore;

    public SpecificStudent(int id, String name, String address, String email, Date birthDate, int IQScore) {
        super(id, name, address, email, birthDate);
        this.IQScore = IQScore;
    }
    public static void main(String[] args) {
        SpecificStudent s1 = new SpecificStudent(1, "Ahmed Ali", "Fayoum-Egypt", "ahmed@fym.eg", new Date("09/05/2000"), 12);

        System.out.println(s1);
    }
}
