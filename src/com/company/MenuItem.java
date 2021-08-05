package com.company;

import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private Boolean isNewItem;

    public MenuItem (String name, String category, String description, Double price){
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;

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
        return isNewItem;
    }

    public void setIsNewItem(Boolean newItem) {
        this.isNewItem = newItem;
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (!(toBeCompared instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) toBeCompared;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
