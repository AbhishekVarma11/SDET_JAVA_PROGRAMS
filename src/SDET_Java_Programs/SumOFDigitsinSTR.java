package SDET_Java_Programs;

public class SumOFDigitsinSTR {
    public static void main(String[] args) {
        String str = "ab89shek1";
        int sum=SUMOFDIGITS(str);
        System.out.println("Sum of digits: " + sum);
    }
	private static int SUMOFDIGITS(String str)
	{
	int sum = 0;
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (Character.isDigit(c)) {
            sum += Character.getNumericValue(c);
        }
    }
    return sum;
}
}


