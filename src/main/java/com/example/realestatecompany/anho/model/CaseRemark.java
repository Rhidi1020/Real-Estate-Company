package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class CaseRemark {
    private int remarkId;
    private String remarkText;
    private LocalDate remarkDate;

    public CaseRemark(int remarkId, String remarkText, LocalDate remarkDate) {
        this.remarkId = remarkId;
        this.remarkText = remarkText;
        this.remarkDate = remarkDate;
    }

    public CaseRemark() {
    }

    public int getRemarkId() {
        return remarkId;
    }

    public void setRemarkId(int remarkId) {
        this.remarkId = remarkId;
    }

    public String getRemarkText() {
        return remarkText;
    }

    public void setRemarkText(String remarkText) {
        this.remarkText = remarkText;
    }

    public LocalDate getRemarkDate() {
        return remarkDate;
    }

    public void setRemarkDate(LocalDate remarkDate) {
        this.remarkDate = remarkDate;
    }

    @Override
    public String toString() {
        return "CaseRemark{" +
                "remarkId=" + remarkId +
                ", remarkText='" + remarkText + '\'' +
                ", remarkDate=" + remarkDate +
                '}';
    }

    public void addRemark() {
    }

    public void getRemark() {
    }
}
