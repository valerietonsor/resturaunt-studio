package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	MenuItem brownies = new MenuItem("Brownies", "dessert", "so good, no words needed", 3.50, LocalDate.now());
	MenuItem cheeseCurds = new MenuItem("cheese curds", "appetizer", "Wisconsin's finest", 8.50, LocalDate.now());
	MenuItem chipsAndQueso = new MenuItem("chips and queso", "appetizer", "white queso for the win", 5.00, LocalDate.now());
	MenuItem cheeseburger = new MenuItem("cheeseburger", "main", "fresh beef with cheddar", 12.00, LocalDate.now());
	MenuItem griledCheese = new MenuItem("grilled cheese", "main", "5 cheese sandwich", 7.50, LocalDate.now());
	MenuItem strawberryPie = new MenuItem("strawberry pie", "dessert", "strawberries, pie crust, topped with whipped cream", 6.00, LocalDate.now());



    Menu ourMenu = new Menu();

      ourMenu.addMenuItem(brownies);
      ourMenu.addMenuItem(cheeseCurds);
      ourMenu.addMenuItem(chipsAndQueso);
      ourMenu.addMenuItem(cheeseburger);
      ourMenu.addMenuItem(griledCheese);
      ourMenu.addMenuItem(strawberryPie);



        System.out.println("Menu last updated on" + ourMenu.getLastUpdated());
        brownies.checkItemNew();
        System.out.println(ourMenu);

    }
}
