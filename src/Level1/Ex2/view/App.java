package Level1.Ex2.view;

import Level1.Ex2.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void run(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbersReverse = new ArrayList<>();
        ListIterator<Integer> lit = numbers.listIterator(numbers.size());

        Utils.printList(numbers);
        while(lit.hasPrevious())
            numbersReverse.add(lit.previous());
        Utils.printList(numbersReverse);
    }
}
