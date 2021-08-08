package com.company;
import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private ArrayList<MenuItem> appArray = new ArrayList<>();
    private ArrayList<MenuItem> mainArray = new ArrayList<>();
    private ArrayList<MenuItem> dessertArray = new ArrayList<>();
    private LocalDate lastUpdated;
    private String printMenu;

    private ArrayList<MenuItem> getMenuItems() {
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

    public void menuUpdated() {
        this.lastUpdated = LocalDate.now();
    }

    public void addMenuItem(MenuItem newMenuItem) {
        for (MenuItem item : menuItems) {
            if (newMenuItem.equals(item)) {
                System.out.println("Item already included!");
                return;
            }
        }
        menuItems.add(newMenuItem);
        newMenuItem.setIsNewItem(true);
        menuUpdated();
    }

    public void removeMenuItem(MenuItem wantToDelete) {
        menuItems.remove(wantToDelete);
        menuUpdated();
    }

    public void categorizeItems(){
        for (MenuItem item : menuItems){
            if (item.getCategory() == "appetizer") {
                appArray.add(item);

            }
                else if (item.getCategory() == "main") {
                    mainArray.add(item);

            }
                else if (item.getCategory() == "dessert") {
                dessertArray.add(item);
            }
    }}

//    public void newItemPrint(){
//
//
//
//    }



    public String toString(){
        for (MenuItem item: menuItems) {
            item.checkItemNew();
        }
        categorizeItems();

        String printApps = "Appetizers: \n";
        String printMains = "Main Dishes: \n";
        String printDesserts = "Desserts: \n";
        System.out.println("Our Menu \n");

        for (MenuItem item : appArray) {
            if (item.getIsNewItem()) {
                printApps += "\n" + item.getName() + "- NEW" + "\n" + item.getDescription() + "\n" + "price: $" + item.getPrice() + "0 \n\n";
            }
            else {
                printApps += "\n" + item.getName() + "\n" + item.getDescription() + "\n" + "price: $" + item.getPrice() + "0 \n\n";
            }
        }

        for (MenuItem item : mainArray) {
            if (item.getIsNewItem()) {
                printMains += "\n" + item.getName() + "- NEW" + "\n" + item.getDescription() + "\n" + "price: $" + item.getPrice() + "0 \n\n";
            }
            else {
                printMains += "\n" + item.getName() + "\n" + item.getDescription() + "\n" + "price: $" + item.getPrice() + "0 \n\n";
            }
        }

        for (MenuItem item : dessertArray) {
            if (item.getIsNewItem()) {
                printDesserts += "\n" + item.getName() + "- NEW" + "\n" + item.getDescription() + "\n" + "price: $" + item.getPrice() + "0 \n\n";
            }
            else {
                printDesserts += "\n" + item.getName() + "\n" + item.getDescription() + "\n" + "price: $" + item.getPrice() + "0 \n\n";
            }
        }

        String printMenu = printApps + printMains + printDesserts;
       return printMenu;
    }
}

