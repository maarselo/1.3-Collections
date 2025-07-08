package Level3;

import Level3.services.ManagePeople;
import Level3.view.Menu;

public class Main {
    public static void main(String []args) {
        ManagePeople managePeople = new ManagePeople();
        Menu menu = new Menu(managePeople);
        menu.startMenu();
    }
}
