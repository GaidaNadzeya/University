package com.company;

public class People {
    private String FIO;
    private int age;
    private Address address;
    private String gender;

    public People(String FIO, int age, Address address) {
        this.FIO = FIO;
        this.age = age;
        this.address = address;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FIO='" + FIO + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
