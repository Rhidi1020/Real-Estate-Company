package com.example.realestatecompany.afia.model;

import java.io.Serializable;

public class Material implements Serializable {

    private String materialId;
    private String name;
    private String category;
    private double unitPrice;
    private double availableQuantity;

    public Material(String materialId, String name, String category,
                    double unitPrice, double availableQuantity) {

        this.materialId = materialId;
        this.name = name;
        this.category = category;
        this.unitPrice = unitPrice;
        this.availableQuantity = availableQuantity;
    }

    public String getMaterialId() { return materialId; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getUnitPrice() { return unitPrice; }
    public double getAvailableQuantity() { return availableQuantity; }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setAvailableQuantity(double availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}