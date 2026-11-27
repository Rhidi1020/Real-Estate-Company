package com.example.realestatecompany.afia.model;

import java.io.Serializable;
import java.time.LocalDate;

public class MaterialRequest implements Serializable {

    private String requestId;
    private String projectId;
    private String materialId;
    private double quantity;
    private LocalDate requestDate;
    private LocalDate requiredDate;
    private String priority;
    private String status;

    public MaterialRequest(String requestId, String projectId,
                           String materialId, double quantity,
                           LocalDate requestDate, LocalDate requiredDate,
                           String priority, String status) {

        this.requestId = requestId;
        this.projectId = projectId;
        this.materialId = materialId;
        this.quantity = quantity;
        this.requestDate = requestDate;
        this.requiredDate = requiredDate;
        this.priority = priority;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public double getQuantity() {
        return quantity;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}