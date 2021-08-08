package com.company;

import java.time.LocalDate;
import java.util.Objects;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private LocalDate date;
    private Boolean isNewItem;

    public MenuItem (String name, String category, String description, Double price, LocalDate date){
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.date = date;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Boolean getIsNewItem() {
        return isNewItem;
    }

    public void setIsNewItem(Boolean newItem) {
        this.isNewItem = newItem;
    }

    public void checkItemNew(){
        long daysBetween = ChronoUnit.DAYS.between(date, LocalDate.now());
        if (daysBetween > 30) {
            isNewItem = false;
        }
            else{
                isNewItem = true;
            }
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
                ", isNewItem=" + isNewItem +
                '}';
    }
}
