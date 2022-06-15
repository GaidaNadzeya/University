package com.company;

public class Student extends People {


    public Student(String FIO, int age, Address address) {
        super(FIO, age, address);
    }

    @Override
    public String toString() {
        return "Student" + super.toString();
    }
}
