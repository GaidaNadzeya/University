package com.company;

public class Address {
    private String city;
    private String street;
    private int numberHouse;
    private int numberApartment;

    public Address(String city, String street, int numberHouse, int numberApartment) {
        this.city = city;
        this.street = street;
        this.numberHouse = numberHouse;
        this.numberApartment = numberApartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberHouse=" + numberHouse +
                ", numberApartment=" + numberApartment +
                '}';
    }
}
