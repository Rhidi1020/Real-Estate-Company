package com.example.realestatecompany.Rhidi;

public class AddEmployeeRole {
    private String roleName;
    private String roleDescriptionFields;

    public AddEmployeeRole(String roleName, String roleDescriptionFields) {
        this.roleName = roleName;
        this.roleDescriptionFields = roleDescriptionFields;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescriptionFields() {
        return roleDescriptionFields;
    }

    public void setRoleDescriptionFields(String roleDescriptionFields) {
        this.roleDescriptionFields = roleDescriptionFields;
    }

    @Override
    public String toString() {
        return "AddEmployeeRole{" +
                "roleName='" + roleName + '\'' +
                ", roleDescriptionFields='" + roleDescriptionFields + '\'' +
                '}';
    }
}
