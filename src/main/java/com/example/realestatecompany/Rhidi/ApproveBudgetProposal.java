package com.example.realestatecompany.Rhidi;

import java.time.LocalDate;

public class ApproveBudgetProposal {
    private String projectName;
    private Float proposedAmount;
    private String satus;
    private LocalDate submissionDate;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Float getProposedAmount() {
        return proposedAmount;
    }

    public void setProposedAmount(Float proposedAmount) {
        this.proposedAmount = proposedAmount;
    }

    public String getSatus() {
        return satus;
    }

    public void setSatus(String purpose) {
        this.satus = purpose;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "ApproveBudgetProposal{" +
                "projectName='" + projectName + '\'' +
                ", proposedAmount=" + proposedAmount +
                ", purpose='" + satus + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }

    public ApproveBudgetProposal(String projectName, Float proposedAmount, String purpose, LocalDate submissionDate) {
        this.projectName = projectName;
        this.proposedAmount = proposedAmount;
        this.satus = purpose;
        this.submissionDate = submissionDate;





    }
}
