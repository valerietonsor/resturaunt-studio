package com.company;
import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
