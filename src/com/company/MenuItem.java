package com.company;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private Boolean newItem = false;

    public MenuItem (String category, String description, Double price, Boolean newItem){
        this.category = category;
        this.description = description;
        this.price = price;
        this.newItem = newItem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }
}
