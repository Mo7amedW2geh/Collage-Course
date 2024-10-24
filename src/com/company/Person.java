package com.company;


import javax.swing.JOptionPane;
import java.util.Date;

public class Person{
    private String firstName, middleName, lastName, familyName, address, mobileNumber, landlineNumber;
    private int id, gender;
    private Date dateOfBirth;
    private String[] familyNames;

    public void person(String firstName, String middleName, String lastName, String familyName, String address, String mobileNumber, String landlineNumber, int id, int gender, Date dateOfBirth, String[] familyNames) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.familyName = familyName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.landlineNumber = landlineNumber;
        this.id = id;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.familyNames = familyNames;
    }
    public void displayInformation(){
        JOptionPane.showMessageDialog(null,
                "Personal Information" +
                        "\nId: " + id +
                        "\nGender: " + (gender == 1 ? "Male" : (gender == 2 ? "Female" : "null")) +
                        "\nFull Name: " + firstName + " " + middleName + " " + lastName + " " + familyName +
                        "\nAddress: " + address +
                        "\nMobile: " + mobileNumber +
                        "\nLandline: " + landlineNumber +
                        "\nBirth Date: " + dateOfBirth +
                        "\nFamily names:" + "\n1-" + familyNames[0] + "\n2-" + familyNames[1] + "\n3-" + familyNames[2] + "\n4-" + familyNames[3] + "\n5-" + familyNames[4]);
    }


    /*public static void main(String[] args){
        Person p1 = new Person();

        Date dateOfBirth = new Date("3/6/2004");
        String[] familyNames = {"Member1", "Member2", "Member3", "Member4", "Member5"};

        p1.person("Mohamed", "Wageh", "Mahmoud", "Tayee", "fayoum", "0101111111", "0841232", 1, 1, dateOfBirth, familyNames);

        p1.displayInformation();
    }*/

}