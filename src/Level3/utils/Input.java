package Level3.utils;

import Level3.exceptions.InputContainDigits;
import Level3.exceptions.InputEmpty;
import Level3.exceptions.InputIncorrectException;
import Level3.exceptions.InputOutOfRange;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner keyboard = new Scanner(System.in);

    public static int readInt(int min, int max, String message){
        while (true) {
            try {
                System.out.print(message);
                int number = keyboard.nextInt();
                keyboard.nextLine();
                Check.checkInt(min, max, number);
                return (number);
            } catch (InputMismatchException | InputOutOfRange e) {
                keyboard.nextLine();
                System.out.println(e.getMessage());
            }
        }
    }
    public static String readNames(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = keyboard.nextLine();
                Check.checkNames(input);
                return (input);
            } catch (InputContainDigits | InputEmpty e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static String readDni(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = keyboard.nextLine();
                Check.checkDni(input);
                return (input);
            } catch (InputIncorrectException | InputEmpty e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
