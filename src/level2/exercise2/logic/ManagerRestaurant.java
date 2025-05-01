package level2.exercise2.logic;

import level2.exercise2.classData.Restaurant;

import java.util.HashSet;
import java.util.List;

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
    public void descendingOrder(){
        List<Restaurant> list = Restaurant.convertList(restaurantHashSet);

        list.sort(Restaurant.descendingComparator());

        for(Restaurant restaurant: list){
            System.out.println(restaurant);
        }
    }
}
