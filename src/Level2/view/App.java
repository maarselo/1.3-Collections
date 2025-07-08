package Level2.view;

import Level2.model.Restaurant;
import Level2.services.ManageRestaurants;

import java.util.HashSet;
import java.util.TreeSet;

public class App {
    public void run() {
        TreeSet<Restaurant> restaurants = new TreeSet<>();
        ManageRestaurants manageRestaurants = new ManageRestaurants(restaurants);
        manageRestaurants.showMenu();
    }
}
