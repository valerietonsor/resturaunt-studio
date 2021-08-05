package com.company;

public class Main {

    public static void main(String[] args) {
	MenuItem brownies = new MenuItem("Brownies", "dessert", "so good, no words needed", 3.50);
    Menu ourMenu = new Menu();

      ourMenu.addMenuItem(brownies);
        System.out.println(ourMenu);
        ourMenu.addMenuItem(brownies);

    }
}
