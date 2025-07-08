package Level1.Ex1.utils;

import Level1.Ex1.model.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Utils {
    public static void printMonths(ArrayList<Month> monts) {
        System.out.println("MONTHS LIST:");
        for (Month m : monts)
            System.out.println(m.getName());
    }
    public static void printMonthsSet(HashSet<Month> months) {
        Iterator<Month> it = months.iterator();

        System.out.println("MONTHS SET:");
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
        //months.forEach(Month -> System.out.println(Month.getName()));
    }
}
