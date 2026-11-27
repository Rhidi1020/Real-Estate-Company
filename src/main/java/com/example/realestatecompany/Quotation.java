package com.example.realestatecompany;

import java.io.Serializable;
import java.time.LocalDate;

public class Quotation implements Serializable {

    private String quotationId;
    private String requestId;
    private double quotedPrice;
    private LocalDate deliveryDate;

    public Quotation(String quotationId, String requestId,
                     double quotedPrice, LocalDate deliveryDate) {

        this.quotationId = quotationId;
        this.requestId = requestId;
        this.quotedPrice = quotedPrice;
        this.deliveryDate = deliveryDate;
    }

    public String getQuotationId() { return quotationId; }
    public String getRequestId() { return requestId; }
    public double getQuotedPrice() { return quotedPrice; }
    public LocalDate getDeliveryDate() { return deliveryDate; }
}