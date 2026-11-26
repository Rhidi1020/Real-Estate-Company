package com.example.realestatecompany.anho.model;

public class PropertySearch {
    private String propertyType;
    private double minPrice;
    private double maxPrice;
    private String location;

    public PropertySearch(String propertyType, double minPrice, double maxPrice, String location) {
        this.propertyType = propertyType;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.location = location;
    }

    public PropertySearch() {
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PropertySearch{" +
                "propertyType='" + propertyType + '\'' +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", location='" + location + '\'' +
                '}';
    }

    public void searchProperty(){

    }

    public void applyFilters(){

    }
}
