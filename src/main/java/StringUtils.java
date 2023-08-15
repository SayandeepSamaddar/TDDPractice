import java.lang.*;
public class StringUtils {

    public static String reverseLastTwoChars(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }

        int len = input.length();
        char secondLast = input.charAt(len - 2);
        char last = input.charAt(len - 1);

        StringBuilder result = new StringBuilder(input);
        result.setCharAt(len - 2, last);
        result.setCharAt(len - 1, secondLast);

        return result.toString();
    }
}
