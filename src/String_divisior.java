
public class String_divisior {

	public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "AB";
        String result = gcdOfStrings(str1, str2);
        
        System.out.println("Largest Common Divisor: " + result);
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            // If the concatenated strings are not equal, there is no common divisor
            return "";
        }

        // Find the greatest common divisor using the Euclidean algorithm
        int length1 = str1.length();
        int length2 = str2.length();
        int gcd = gcd(length1, length2);

        // Extract the common divisor string
        return str1.substring(0, gcd);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
