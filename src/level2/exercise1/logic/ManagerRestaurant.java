package level2.exercise1.logic;

import level2.exercise1.classData.Restaurant;

import java.util.HashSet;

public class ManagerRestaurant {

    private HashSet<Restaurant>restaurantHashSet;

    public ManagerRestaurant(){
        this.restaurantHashSet = new HashSet<>();
        addRestaurant();
    }

    public void addRestaurant(){
        restaurantHashSet.add(new Restaurant("Lager & Chips",23));
        restaurantHashSet.add(new Restaurant("Lager & Chips",23));
        restaurantHashSet.add(new Restaurant("Lager & Chips",17));
        restaurantHashSet.add(new Restaurant("Lager & Chips",4));
        restaurantHashSet.add(new Restaurant("Lord & Breakfast",7));
        restaurantHashSet.add(new Restaurant("Tio Botija",11));

    }
    public void printRestaurant(){
        for(Restaurant restaurant: restaurantHashSet){
            System.out.println(restaurant);
        }

    }
}
