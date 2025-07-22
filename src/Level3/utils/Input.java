package Level3.utils;

import Level3.exceptions.InputContainDigitsException;
import Level3.exceptions.InputEmptyException;
import Level3.exceptions.InputIncorrectException;
import Level3.exceptions.InputOutOfRangeException;

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
            } catch (InputMismatchException | InputOutOfRangeException e) {
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
            } catch (InputContainDigitsException | InputEmptyException e) {
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
            } catch (InputIncorrectException | InputEmptyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
