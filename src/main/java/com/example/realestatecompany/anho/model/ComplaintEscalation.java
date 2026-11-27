package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class ComplaintEscalation {
    private int escalationId;
    private LocalDate escalationDate;
    private String reason;

    public ComplaintEscalation(int escalationId, LocalDate escalationDate, String reason) {
        this.escalationId = escalationId;
        this.escalationDate = escalationDate;
        this.reason = reason;
    }

    public ComplaintEscalation() {
    }

    public int getEscalationId() {
        return escalationId;
    }

    public void setEscalationId(int escalationId) {
        this.escalationId = escalationId;
    }

    public LocalDate getEscalationDate() {
        return escalationDate;
    }

    public void setEscalationDate(LocalDate escalationDate) {
        this.escalationDate = escalationDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "ComplaintEscalation{" +
                "escalationId=" + escalationId +
                ", escalationDate=" + escalationDate +
                ", reason='" + reason + '\'' +
                '}';
    }

    public void escalateComplaint() {
    }

    public void selectDepartment() {
    }
}
