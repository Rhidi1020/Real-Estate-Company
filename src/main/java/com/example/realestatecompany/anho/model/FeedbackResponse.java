package com.example.realestatecompany.anho.model;

import java.time.LocalDate;

public class FeedbackResponse {
    private int responseId;
    private String responseMessage;
    private LocalDate responseDate;

    public FeedbackResponse(int responseId, String responseMessage, LocalDate responseDate) {
        this.responseId = responseId;
        this.responseMessage = responseMessage;
        this.responseDate = responseDate;
    }

    public FeedbackResponse() {
    }

    public int getResponseId() {
        return responseId;
    }

    public void setResponseId(int responseId) {
        this.responseId = responseId;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public LocalDate getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(LocalDate responseDate) {
        this.responseDate = responseDate;
    }

    @Override
    public String toString() {
        return "FeedbackResponse{" +
                "responseId=" + responseId +
                ", responseMessage='" + responseMessage + '\'' +
                ", responseDate=" + responseDate +
                '}';
    }

    public void searchFeedback() {
    }

    public void submitResponse() {
    }
}
