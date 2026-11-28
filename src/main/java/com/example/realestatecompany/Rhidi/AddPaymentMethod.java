package com.example.realestatecompany.Rhidi;

public class AddPaymentMethod {
    private String paymentMethodName;
    private int paymentMethodID;
    private String description;
    private String Status;

    public AddPaymentMethod(String paymentMethodName, int paymentMethodID, String description, String status) {
        this.paymentMethodName = paymentMethodName;
        this.paymentMethodID = paymentMethodID;
        this.description = description;
        Status = status;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    public int getPaymentMethodID() {
        return paymentMethodID;
    }

    public void setPaymentMethodID(int paymentMethodID) {
        this.paymentMethodID = paymentMethodID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "AddPaymentMethod{" +
                "paymentMethodName='" + paymentMethodName + '\'' +
                ", paymentMethodID=" + paymentMethodID +
                ", description='" + description + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
