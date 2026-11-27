package com.example.realestatecompany.afia.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Milestone implements Serializable {

    private String milestoneId;
    private String projectId;
    private String name;
    private LocalDate targetDate;
    private String status;

    public Milestone(String milestoneId, String projectId, String name, LocalDate targetDate) {
        this.milestoneId = milestoneId;
        this.projectId = projectId;
        this.name = name;
        this.targetDate = targetDate;
        this.status = "Not Started";
    }

    public String getMilestoneId() {
        return milestoneId;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}