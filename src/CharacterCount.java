import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "abhia";
        String result = countCharacters(input);
        System.out.println(result);
    }

    private static String countCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Build the output string
        StringBuilder output = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            output.append(entry.getKey()).append(entry.getValue());
        }

        return output.toString();
    }
}
