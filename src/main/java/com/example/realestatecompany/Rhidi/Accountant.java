package com.example.realestatecompany.Rhidi;

public class Accountant {
    private String name;
    private int age;
    private int nidNUmber;
    private String address;
    private String phoneNumber;

    public Accountant(String name, int age, int nidNUmber, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.nidNUmber = nidNUmber;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNidNUmber() {
        return nidNUmber;
    }

    public void setNidNUmber(int nidNUmber) {
        this.nidNUmber = nidNUmber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nidNUmber=" + nidNUmber +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
