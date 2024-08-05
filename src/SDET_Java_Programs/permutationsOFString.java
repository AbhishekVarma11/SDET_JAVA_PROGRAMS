package SDET_Java_Programs;
import java.util.HashSet;
import java.util.Set;

public class permutationsOFString {


    public static Set<String> getPermutations(String str) {

        Set<String> permutations = new HashSet<>();
        if (str == null || str.length() == 0) {
            permutations.add("");
            return permutations;
        }
        char firstChar = str.charAt(0);
        String remainingString = str.substring(1);
        Set<String> words = getPermutations(remainingString);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String permutation = word.substring(0, i) + firstChar + word.substring(i);
                permutations.add(permutation);
            }
        }

        return permutations;
    }
    public static void main(String[] args) {
        String str = "123";
        Set<String> permutations = getPermutations(str);
        System.out.println("Permutations of " + str + ": " + permutations);
    }
}
