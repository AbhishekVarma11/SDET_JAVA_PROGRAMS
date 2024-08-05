package practice;
import java.util.ArrayList;
import java.util.List;

public class splitTheStringandNumbers {
    public static void main(String[] args) {
        String input = "abhi90shek1varma11";
        List<String> result = splitString(input);

        // Print the result
        for (String part : result) {
            System.out.println(part);
        }
    }

    // Function to split a string when it encounters a number
    static List<String> splitString(String input) {
        List<String> result = new ArrayList<>();
        StringBuilder currentSubstring = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                // If the current substring is not empty, add it to the result
                if (currentSubstring.length() > 0) {
                    result.add(currentSubstring.toString());
                    currentSubstring.setLength(0);  // Reset the substring
                }
                // Add the digit as a separate substring
                result.add(String.valueOf(c));
            } else {
                // Add the character to the current substring
                currentSubstring.append(c);
            }
        }

        // If the last substring is not empty, add it to the result
        if (currentSubstring.length() > 0) {
            result.add(currentSubstring.toString());
        }

        return result;
    }
}
