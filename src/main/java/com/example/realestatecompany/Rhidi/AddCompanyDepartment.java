package com.example.realestatecompany.Rhidi;

public class AddCompanyDepartment {
    private String departmentName;
    private String descriptionFields;

    public AddCompanyDepartment(String departmentName, String descriptionFields) {
        this.departmentName = departmentName;
        this.descriptionFields = descriptionFields;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescriptionFields() {
        return descriptionFields;
    }

    public void setDescriptionFields(String descriptionFields) {
        this.descriptionFields = descriptionFields;
    }

    @Override
    public String toString() {
        return "AddCompanyDepartment{" +
                "departmentName='" + departmentName + '\'' +
                ", descriptionFields='" + descriptionFields + '\'' +
                '}';
    }
}
