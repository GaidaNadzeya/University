package com.company;

public class Teacher extends People {

    private double stavka = 3.7;
    private double numberHours;

    public Teacher(String FIO, int age, Address address, double stavka, double numberHours) {
        super(FIO, age, address);
        this.stavka = stavka;
        this.numberHours = numberHours;
    }


    public double getStavka() {
        return stavka;
    }

    public void setStavka(double stavka) {
        this.stavka = stavka;
    }

    public double getNumberHours() {
        return numberHours;
    }

    public void setNumberHours(double numberHours) {
        this.numberHours = numberHours;
    }

    public int calculateSalary() {
        return (int) (stavka * numberHours);
    }


    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", stavka=" + stavka +
                ", numberHours=" + numberHours +
                '}';
    }
}
