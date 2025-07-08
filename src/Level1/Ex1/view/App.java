package Level1.Ex1.view;

import Level1.Ex1.model.Month;
import Level1.Ex1.utils.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void run() {
        List<String> monthsName = List.of("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        ArrayList<Month> months = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            if (monthsName.get(i).equals("August"))
                continue;
            else
                months.add(new Month(monthsName.get(i)));
        }
        Utils.printMonths(months);

        months.add(7, new Month(monthsName.get(7)));
        System.out.println();
        Utils.printMonths(months);

        HashSet<Month> monthsSet = new HashSet<>(months);
        System.out.println();
        Utils.printMonthsSet(monthsSet);

        monthsSet.add(new Month("January"));
        System.out.println();
        Utils.printMonthsSet(monthsSet);
    }
}
