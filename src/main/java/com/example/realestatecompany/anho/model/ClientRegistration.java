package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class ClientRegistration {
    private int registrationId;
    private LocalDate registrationDate;
    private String clientName;
    private String email;
    private String phone;
    private String address;
    private String username;
    private String password;


    public ClientRegistration(int registrationId, LocalDate registrationDate, String clientName, String email, String phone, String address, String username, String password) {
        this.registrationId = registrationId;
        this.registrationDate = registrationDate;
        this.clientName = clientName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;

    }

    public ClientRegistration() {
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "ClientRegistration{" +
                "registrationId=" + registrationId +
                ", registrationDate=" + registrationDate +
                ", clientName='" + clientName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +


                '}';
    }

    public void registerClient(){

    }

    public boolean validateInformation(){

    }
}

