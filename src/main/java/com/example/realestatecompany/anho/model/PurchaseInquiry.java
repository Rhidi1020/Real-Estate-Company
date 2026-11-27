package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class PurchaseInquiry {
    private int inquiryId;
    private LocalDate inquiryDate;
    private String contactDetails;
    private String paymentPreference;

    public PurchaseInquiry(int inquiryId, LocalDate inquiryDate, String contactDetails, String paymentPreference) {
        this.inquiryId = inquiryId;
        this.inquiryDate = inquiryDate;
        this.contactDetails = contactDetails;
        this.paymentPreference = paymentPreference;
    }

    public PurchaseInquiry() {
    }

    public int getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(int inquiryId) {
        this.inquiryId = inquiryId;
    }

    public LocalDate getInquiryDate() {
        return inquiryDate;
    }

    public void setInquiryDate(LocalDate inquiryDate) {
        this.inquiryDate = inquiryDate;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getPaymentPreference() {
        return paymentPreference;
    }

    public void setPaymentPreference(String paymentPreference) {
        this.paymentPreference = paymentPreference;
    }

    @Override
    public String toString() {
        return "PurchaseInquiry{" +
                "inquiryId=" + inquiryId +
                ", inquiryDate=" + inquiryDate +
                ", contactDetails='" + contactDetails + '\'' +
                ", paymentPreference='" + paymentPreference + '\'' +
                '}';
    }

    public void submitInquiry(){

    }

    public void validateInquiry(){

    }


}
