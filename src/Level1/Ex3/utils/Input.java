package Level1.Ex3.utils;

import Level1.Ex3.exceptions.EmptyString;

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
            } catch (EmptyString e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void checkString(String input) throws EmptyString {
        if (input.isEmpty())
            throw new EmptyString("The string cannot be empty.");
    }
}

