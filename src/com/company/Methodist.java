package com.company;

import java.util.ArrayList;
import java.util.List;

public class Methodist extends Teacher {
    private List<Teacher> teacherList = new ArrayList<>();

    public Methodist(String FIO, int age, Address address, double stavka, double numberHours) {
        super(FIO, age, address, stavka, numberHours);
    }


    @Override
    public String toString() {
        return "Methodist{" + super.toString() +
                "teacherList=" + teacherList +
                '}';
    }
}
