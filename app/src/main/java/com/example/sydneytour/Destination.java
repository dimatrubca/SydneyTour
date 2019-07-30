package com.example.sydneytour;

public class Destination {
    private String name;
    private String location;
    private int descriptionResourceId;
    private int imageResourceId;

    public Destination(String name, String location, int descriptionResourceId, int imageResourceId) {
        this.name = name;
        this.location = location;
        this.descriptionResourceId = descriptionResourceId;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getDescriptionResourceId() {
        return descriptionResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
