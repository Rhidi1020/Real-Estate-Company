package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class FeedbackSubmission {
    private int feedbackId;
    private String category;
    private String comments;
    private String rating;
    private LocalDate submissionDate;

    public FeedbackSubmission(int feedbackId, String category, String comments, String rating, LocalDate submissionDate) {
        this.feedbackId = feedbackId;
        this.category = category;
        this.comments = comments;
        this.rating = rating;
        this.submissionDate = submissionDate;
    }

    public FeedbackSubmission() {
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "FeedbackSubmission{" +
                "feedbackId=" + feedbackId +
                ", category='" + category + '\'' +
                ", comments='" + comments + '\'' +
                ", rating='" + rating + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }

    public void submitFeedback(){

    }

    public void validateFeedback(){

    }
}
