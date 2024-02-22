package com.example.recyclerview;

// Animal.java
public class Animal {
    private int imageId;
    private String name;
    private String type;

    public Animal(int imageId, String name, String type) {
        this.imageId = imageId;
        this.name = name;
        this.type = type;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
