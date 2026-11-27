package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class PaymentTransaction {
    private int transactionId;
    private double amount;
    private LocalDate transactionDate;
    private String paymentMethod;
    private String status;

    public PaymentTransaction(int transactionId, double amount, LocalDate transactionDate, String paymentMethod, String status) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }

    public PaymentTransaction() {
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PaymentTransaction{" +
                "transactionId=" + transactionId +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void executeTransaction() {
    }

    public void generateTransactionId() {
    }
}
