package Level1.Ex2.utils;

import java.util.List;

public class Utils {
    public static void printList(List<Integer> numbers) {
        System.out.println("NUMBERS LIST");
        numbers.forEach(n -> System.out.println(n));
    }
}
