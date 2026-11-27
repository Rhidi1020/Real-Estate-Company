
package com.example.realestatecompany.afia.model;

import java.io.Serializable;
import java.time.LocalDate;

public class ProjectIssue implements Serializable {

    private String issueId;
    private String projectId;
    private String title;
    private String description;
    private String severity;
    private LocalDate dateIdentified;
    private String status;

    public ProjectIssue(String issueId, String projectId, String title, String description, String severity, LocalDate dateIdentified, String status) {
        this.issueId = issueId;
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.severity = severity;
        this.dateIdentified = dateIdentified;
        this.status = status;
    }

    public String getIssueId() {
        return issueId;
    }

    public String getProjectId() {
        return projectId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSeverity() {
        return severity;
    }

    public LocalDate getDateIdentified() {
        return dateIdentified;
    }

    public String getStatus() {
        return status;
    }
}
