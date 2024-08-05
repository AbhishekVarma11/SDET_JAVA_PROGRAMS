package SDET_Java_Programs;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SubstringsOfString {

    public static void main(String args[]) {
        String str = "abhishekeh";
        List<String> substrings = generateSubstrings(str);
        Set<String> setSubStrings = new LinkedHashSet<>(substrings);

        for (String s : setSubStrings) {
            if (isPalindrome(s)&&s.length()>1) {
                System.out.println(s);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static List<String> generateSubstrings(String str) {
        List<String> subList = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                subList.add(str.substring(i, j));
            }
        }
        return subList;
    }
}
