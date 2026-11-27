package com.example.realestatecompany;

import java.io.Serializable;
import java.time.LocalDate;

public class ProjectProgress implements Serializable {

    private String progressId;
    private String projectId;
    private String milestoneId;
    private double progressPercentage;
    private LocalDate progressDate;
    private String status;
    private String description;

    public ProjectProgress(String progressId, String projectId,
                           String milestoneId, double progressPercentage,
                           LocalDate progressDate, String status,
                           String description) {

        this.progressId = progressId;
        this.projectId = projectId;
        this.milestoneId = milestoneId;
        this.progressPercentage = progressPercentage;
        this.progressDate = progressDate;
        this.status = status;
        this.description = description;
    }

    public String getProgressId() {
        return progressId;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getMilestoneId() {
        return milestoneId;
    }

    public double getProgressPercentage() {
        return progressPercentage;
    }

    public LocalDate getProgressDate() {
        return progressDate;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}