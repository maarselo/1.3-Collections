package Level2.services;

import Level2.Utils.Input;
import Level2.model.Restaurant;
import Level2.view.MenuTexts;

import java.util.HashSet;
import java.util.TreeSet;

public class ManageRestaurants {
    private TreeSet<Restaurant> restaurants;
    public ManageRestaurants(TreeSet<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public void showMenu(){
        int option;
        while(true) {
            System.out.println(MenuTexts.menuText);
            option = Input.readInt(2, 0 , "Choose a option(0-2): ");
            switch (option) {
                case 0 -> {
                    System.out.println("Bye, see you soon.");
                    return;
                }
                case 1 -> addRestaurant();
                case 2 -> showRestaurants();
            }
        }
    }
    public void addRestaurant() {
        String name = Input.readString("Which is the name of the restaurant? ");
        int punctuation = Input.readInt(10, 0, "Which is the punctuation? ");
        Restaurant restaurantToAdd = new Restaurant(name, punctuation);
        for (Restaurant r : restaurants) {
            if (r.equals(restaurantToAdd)) {
                System.out.println("The restaurant is already.");
                return;
            }
        }
        this.restaurants.add(restaurantToAdd);
        System.out.println("The restaurant was added successfully :)");
    }
    public void showRestaurants() {
        for (Restaurant r : restaurants) {
            System.out.println(r.toString());
        }
    }
}
