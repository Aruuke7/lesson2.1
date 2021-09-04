package com.company;

public class Manufacture {
    private Brand brand;
    private String city;
    private String country;

    public Manufacture(Brand brand, String city, String country) {
        this.brand = brand;
        this.city = city;
        this.country = country;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
