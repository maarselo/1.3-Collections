package Level1.Ex3.utils;

import Level1.Ex3.exceptions.EmptyStringException;

import java.util.Scanner;

public class Input {
    public static Scanner keyboard = new Scanner(System.in);

    public static String readString(String message) {
        String input;

        while (true) {
            try {
                System.out.print(message);
                input = keyboard.nextLine();
                checkString(input);
                return (input);
            } catch (EmptyStringException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void checkString(String input) throws EmptyStringException {
        if (input.isEmpty())
            throw new EmptyStringException("The string cannot be empty.");
    }
}

