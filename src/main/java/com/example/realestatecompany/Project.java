package com.example.realestatecompany;

import java.io.Serializable;
import java.time.LocalDate;

public class Project implements Serializable {
    private String projectId;
    private String name;
    private String projectType;
    private String location;
    private int  budget;
    private LocalDate plannedStartDate;
    private LocalDate plannedCompletionDate;
    private String description;
    private String status;


    public Project(String projectId, String name, String projectType,
                   String location, int budget,
                   LocalDate plannedStartDate, LocalDate plannedCompletionDate,
                   String description) {
        this.projectId = projectId;
        this.name = name;
        this.projectType = projectType;
        this.location = location;
        this.budget = budget;
        this.plannedStartDate = plannedStartDate;
        this.plannedCompletionDate = plannedCompletionDate;
        this.description = description;
        this.status = "Planned";
    }

    public String getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getProjectType() {
        return projectType;
    }

    public String getLocation() {
        return location;
    }

    public int getBudget() {
        return budget;
    }

    public LocalDate getPlannedStartDate() {
        return plannedStartDate;
    }

    public LocalDate getPlannedCompletionDate() {
        return plannedCompletionDate;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }
}
