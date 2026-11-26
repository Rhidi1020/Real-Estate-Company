package com.example.realestatecompany;

public class Project {
    private String projectId;
    private String name;
    private String location;
    private double budget;
    private String status;


    public Project(String projectId, String name, String location, double budget) {
        this.projectId = projectId;
        this.name = name;
        this.location = location;
        this.budget = budget;
        this.status = "Planned";
    }

    public String getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getBudget() {
        return budget;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
