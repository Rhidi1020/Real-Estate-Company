package com.example.realestatecompany.anho.model;

public class Property {
    private int propertyId;
    private String propertyType;
    private String location;
    private double price;
    private double area;
    private String status;

    public Property(int propertyId, String propertyType, String location, double price, double area, String status) {
        this.propertyId = propertyId;
        this.propertyType = propertyType;
        this.location = location;
        this.price = price;
        this.area = area;
        this.status = status;
    }

    public Property() {
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Property{" +
                "propertyId=" + propertyId +
                ", propertyType='" + propertyType + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", area=" + area +
                ", status='" + status + '\'' +
                '}';
    }

    public void getPropertyDetails(){

    }

    public void updatePropertyStatus(){

    }

}
