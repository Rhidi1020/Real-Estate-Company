package com.example.realestatecompany.Rhidi;

public class CreateCompanyPolicy {
    private String policyTitle;
    private String category;
    private String descriptionFields;

    public CreateCompanyPolicy(String policyTitle, String category, String descriptionFields) {
        this.policyTitle = policyTitle;
        this.category = category;
        this.descriptionFields = descriptionFields;
    }

    public String getPolicyTitle() {
        return policyTitle;
    }

    public void setPolicyTitle(String policyTitle) {
        this.policyTitle = policyTitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescriptionFields() {
        return descriptionFields;
    }

    public void setDescriptionFields(String descriptionFields) {
        this.descriptionFields = descriptionFields;
    }

    @Override
    public String toString() {
        return "CreateCompanyPolicy{" +
                "policyTitle='" + policyTitle + '\'' +
                ", category='" + category + '\'' +
                ", descriptionFields='" + descriptionFields + '\'' +
                '}';
    }
}
