package Level2.Utils;

import Level2.exceptions.EmptyInputException;
import Level2.exceptions.OutOfRangeException;

public class Check {
    public static void checkString(String input) throws EmptyInputException {
        if (input.isEmpty())
            throw new EmptyInputException("The string cannot be empty.");
    }
    public static void checkNumber(int max, int min, int number) throws OutOfRangeException {
        if (number > max || number < min)
            throw new OutOfRangeException("The number must to be into " + min + " to " + max + ".");
    }
}
