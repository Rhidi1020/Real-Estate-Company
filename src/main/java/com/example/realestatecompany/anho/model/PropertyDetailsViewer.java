package com.example.realestatecompany.anho.model;

public class PropertyDetailsViewer {
    private int selectedPropertyId;
    private boolean isFavourite;

    public PropertyDetailsViewer(int selectedPropertyId, boolean isFavourite) {
        this.selectedPropertyId = selectedPropertyId;
        this.isFavourite = isFavourite;
    }

    public PropertyDetailsViewer() {
    }

    public int getSelectedPropertyId() {
        return selectedPropertyId;
    }

    public void setSelectedPropertyId(int selectedPropertyId) {
        this.selectedPropertyId = selectedPropertyId;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    @Override
    public String toString() {
        return "PropertyDetailsViewer{" +
                "selectedPropertyId=" + selectedPropertyId +
                ", isFavourite=" + isFavourite +
                '}';
    }

    public void viewDetails(){

    }

    public void addToFavourites(){

    }

    public void removeFromFavourites(){

    }
}
