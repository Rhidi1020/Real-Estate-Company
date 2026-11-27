package com.example.realestatecompany.anho.model;

public class ComplaintPriority {
    private int priorityId;
    private String priorityLevel;

    public ComplaintPriority(int priorityId, String priorityLevel) {
        this.priorityId = priorityId;
        this.priorityLevel = priorityLevel;
    }

    public ComplaintPriority() {
    }

    public int getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(int priorityId) {
        this.priorityId = priorityId;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "ComplaintPriority{" +
                "priorityId=" + priorityId +
                ", priorityLevel='" + priorityLevel + '\'' +
                '}';
    }

    public void assignPriority() {
    }

    public void updatePriority() {
    }
}
