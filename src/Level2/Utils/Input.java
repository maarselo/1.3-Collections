package Level2.Utils;

import Level2.exceptions.EmptyInputException;
import Level2.exceptions.OutOfRangeException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    static Scanner keyboard = new Scanner((System.in));

    public static int readInt(int max, int min,String message) {
        while(true) {
            try {
                System.out.print(message);
                int number = keyboard.nextInt();
                keyboard.nextLine();
                Check.checkNumber(max, min, number);
                return (number);
            } catch (InputMismatchException | OutOfRangeException e) {
                keyboard.nextLine();
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = keyboard.nextLine();
                Check.checkString(input);
                input = input.trim();
                return (input);
            } catch (EmptyInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
