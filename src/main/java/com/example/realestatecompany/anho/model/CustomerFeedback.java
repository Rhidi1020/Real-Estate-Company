package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class CustomerFeedback {
    private int feedbackId;
    private String category;
    private String comments;
    private int rating;
    private LocalDate submissionDate;
    private String response;

    public CustomerFeedback(int feedbackId, String category, String comments, int rating, LocalDate submissionDate, String response) {
        this.feedbackId = feedbackId;
        this.category = category;
        this.comments = comments;
        this.rating = rating;
        this.submissionDate = submissionDate;
        this.response = response;
    }

    public CustomerFeedback() {
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "CustomerFeedback{" +
                "feedbackId=" + feedbackId +
                ", category='" + category + '\'' +
                ", comments='" + comments + '\'' +
                ", rating=" + rating +
                ", submissionDate=" + submissionDate +
                ", response='" + response + '\'' +
                '}';
    }

    public void saveFeedback() {
    }

    public void addResponse() {
    }
}
