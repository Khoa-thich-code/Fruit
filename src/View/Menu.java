package View;

import View.Manager;
import Model.Fruit;
import Model.Order;
import java.util.ArrayList;
import java.util.Hashtable;

public class Menu {
public static void showMenu() {
    System.out.println("Menu:");
    System.out.println("1. Create Fruit");
    System.out.println("2. View orders");
    System.out.println("3. Shopping (for buyer)");
    System.out.println("4. Exit");
}

    public static void runMenu(ArrayList<Fruit> lf, Hashtable<String, ArrayList<Order>> ht) {
        int choice = Manager.menu();
        switch (choice) {
            case 1:
                Manager.createFruit(lf);
                break;
            case 2:
                Manager.viewOrder(ht);
                break;
            case 3:
                Manager.shopping(lf, ht);
                break;
            case 4:
                return;
        }
    }
}
