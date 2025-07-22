package Level3.utils;

import Level3.exceptions.InputContainDigitsException;
import Level3.exceptions.InputEmptyException;
import Level3.exceptions.InputIncorrectException;
import Level3.exceptions.InputOutOfRangeException;

public class Check {
    public static void checkInt(int min, int max, int input) throws InputOutOfRangeException {
        if (input < min || input > max)
            throw new InputOutOfRangeException("The number must be into " + min +" between " + max + ".");
    }

    public static void checkNames(String input) throws InputEmptyException, InputContainDigitsException {
        if (input.isEmpty())
            throw new InputEmptyException("The camp cannot be empty.");
        String digits = "0123456789";
        for (char c : digits.toCharArray()) {
            if (input.indexOf(c) != -1)
                throw new InputContainDigitsException("The camp cannot have any digits.");

        }
    }
    public static void checkDni(String input) throws InputEmptyException, InputIncorrectException {
        if (input.isEmpty())
            throw new InputEmptyException("The camp cannot be empty.");
        input = input.trim();
        if (input.length() != 9)
            throw new InputIncorrectException("The dni must be contains 9 digits.");
        for (int i = 0; i < input.length() - 1; i++) {
            if (!Character.isDigit(input.charAt(i)))
                throw new InputIncorrectException("The first 8 characters must be digits");
        }
        if (!Character.isAlphabetic(input.charAt(8)))
            throw new InputIncorrectException("The last character must be a letter.");
    }
}
