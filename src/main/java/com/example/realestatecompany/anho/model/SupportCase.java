package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class SupportCase {
    private int caseId;
    private String status;
    private LocalDate openedDate;
    private LocalDate closedDate;
    private String remarks;

    public SupportCase(int caseId, String status, LocalDate openedDate, LocalDate closedDate, String remarks) {
        this.caseId = caseId;
        this.status = status;
        this.openedDate = openedDate;
        this.closedDate = closedDate;
        this.remarks = remarks;
    }

    public SupportCase() {
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(LocalDate openedDate) {
        this.openedDate = openedDate;
    }

    public LocalDate getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDate closedDate) {
        this.closedDate = closedDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "SupportCase{" +
                "caseId=" + caseId +
                ", status='" + status + '\'' +
                ", openedDate=" + openedDate +
                ", closedDate=" + closedDate +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public void reopenCase() {
    }

    public void closeCase() {
    }

    public void getCaseDetails() {
    }
}
