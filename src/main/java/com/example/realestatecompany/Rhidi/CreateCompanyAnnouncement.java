package com.example.realestatecompany.Rhidi;

public class CreateCompanyAnnouncement {
    private String announcementTitel;
    private String category;
    private String description;

    public CreateCompanyAnnouncement(String announcementTitel, String category, String description) {
        this.announcementTitel = announcementTitel;
        this.category = category;
        this.description = description;
    }

    public String getAnnouncementTitel() {
        return announcementTitel;
    }

    public void setAnnouncementTitel(String announcementTitel) {
        this.announcementTitel = announcementTitel;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CreateCompanyAnnouncement{" +
                "announcementTitel='" + announcementTitel + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
