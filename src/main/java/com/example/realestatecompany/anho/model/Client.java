package com.example.realestatecompany.anho.model;

public class Client {
    private int clientId;
    private String phone;
    private String address;

    public Client(int clientId, String phone, String address) {
        this.clientId = clientId;
        this.phone = phone;
        this.address = address;
    }

    public Client() {
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void registerAccount() {
    }

    public void searchProperty() {
    }

    public void submitFeedback() {
    }

    public void makePayment() {
    }
}
