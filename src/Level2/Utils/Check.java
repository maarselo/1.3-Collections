package Level2.Utils;

import Level2.exceptions.ExceptionEmptyInput;
import Level2.exceptions.OutOfRange;

public class Check {
    public static void checkString(String input) throws ExceptionEmptyInput {
        if (input.isEmpty())
            throw new ExceptionEmptyInput("The string cannot be empty.");
    }
    public static void checkNumber(int max, int min, int number) throws OutOfRange {
        if (number > max || number < min)
            throw new OutOfRange("The number must to be into " + min + " to " + max + ".");
    }
}
