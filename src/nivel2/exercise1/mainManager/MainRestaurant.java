package nivel2.exercise1.mainManager;

import nivel2.exercise1.classData.Restaurant;


import java.util.HashSet;

public class MainRestaurant {
    public static void main(String[] args) {


        HashSet<Restaurant>restaurants = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Lager & Chips",23);
        Restaurant restaurant2 = new Restaurant("Lager & Chips",23);
        Restaurant restaurant3 = new Restaurant("Lager & Chips", 4);
        Restaurant restaurant4 = new Restaurant("Lord Breakfast", 4);

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
        restaurants.add(restaurant4);

        System.out.println(restaurants);

    }
}
