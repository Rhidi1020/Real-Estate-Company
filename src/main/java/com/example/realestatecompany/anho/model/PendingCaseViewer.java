package com.example.realestatecompany.anho.model;

public class PendingCaseViewer {
    private String filterCriteria;
    private String searchKeyword;

    public PendingCaseViewer(String filterCriteria, String searchKeyword) {
        this.filterCriteria = filterCriteria;
        this.searchKeyword = searchKeyword;
    }

    public PendingCaseViewer() {
    }

    public String getFilterCriteria() {
        return filterCriteria;
    }

    public void setFilterCriteria(String filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    @Override
    public String toString() {
        return "PendingCaseViewer{" +
                "filterCriteria='" + filterCriteria + '\'' +
                ", searchKeyword='" + searchKeyword + '\'' +
                '}';
    }

    public void viewPendingCases() {
    }

    public void searchPendingCases() {
    }
}
