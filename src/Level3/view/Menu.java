package Level3.view;

import Level3.model.Person;
import Level3.services.ManagePeople;
import Level3.utils.Input;

import java.util.Comparator;
import java.util.Scanner;

public class Menu {
    private static Scanner keyboard = new Scanner(System.in);
    private ManagePeople managePeople;
    private static final String menuText = """
                        MENU
                            1.- Add a person.
                            2.- Show the people ordered by name (A-Z).
                            3.- Show the people ordered by name (Z-A).
                            4.- Show the people ordered by surnames (A-Z).
                            5.- Show the people ordered by surnames (Z-A).
                            6.- Show the people ordered by DNI (1-9).
                            7.- Show the persons ordered by DNI (9-1).
                            0.- Exit.
                        
                        Select an option: """;

    public Menu(ManagePeople managePeople) {
        this.managePeople = managePeople;
    }

    public void startMenu() {
        managePeople.loadFile();
        int option;
        while(true) {
            option = Input.readInt(0, 7, menuText);
            switch (option) {
                case 1 -> managePeople.addPerson();
                case 2 -> managePeople.showSorted(Comparator.comparing(Person::getName));
                case 3 -> managePeople.showSorted(Comparator.comparing(Person::getName).reversed());
                case 4 -> managePeople.showSorted(Comparator.comparing(Person::getSurname));
                case 5 -> managePeople.showSorted(Comparator.comparing(Person::getSurname).reversed());
                case 6 -> managePeople.showSorted(Comparator.comparing(Person::getDni));
                case 7 -> managePeople.showSorted(Comparator.comparing(Person::getDni).reversed());
                case 0 -> {
                    System.out.println("Bye bye :)");
                    return;
                }
            }
        }
    }
}
