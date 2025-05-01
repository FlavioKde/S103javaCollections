package level2.exercise2.mainManager;

import level2.exercise2.logic.ManagerRestaurant;

public class MainRestaurant {
    public static void main(String[] args) {


        ManagerRestaurant managerRestaurant = new ManagerRestaurant();
        managerRestaurant.printRestaurant();
        System.out.println("Descending order");
        managerRestaurant.descendingOrder();


        

    }
}
