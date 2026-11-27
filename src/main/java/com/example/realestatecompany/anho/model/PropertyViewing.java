package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class PropertyViewing {
    private int viewingId;
    private LocalDate viewingDate;
    private String viewingTime;
    private String status;

    public PropertyViewing(int viewingId, LocalDate viewingDate, String viewingTime, String status) {
        this.viewingId = viewingId;
        this.viewingDate = viewingDate;
        this.viewingTime = viewingTime;
        this.status = status;
    }

    public PropertyViewing() {
    }

    public int getViewingId() {
        return viewingId;
    }

    public void setViewingId(int viewingId) {
        this.viewingId = viewingId;
    }

    public LocalDate getViewingDate() {
        return viewingDate;
    }

    public void setViewingDate(LocalDate viewingDate) {
        this.viewingDate = viewingDate;
    }

    public String getViewingTime() {
        return viewingTime;
    }

    public void setViewingTime(String viewingTime) {
        this.viewingTime = viewingTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PropertyViewing{" +
                "viewingId=" + viewingId +
                ", viewingDate=" + viewingDate +
                ", viewingTime='" + viewingTime + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void confirmViewing() {
    }

    public void cancelViewing() {
    }

}
