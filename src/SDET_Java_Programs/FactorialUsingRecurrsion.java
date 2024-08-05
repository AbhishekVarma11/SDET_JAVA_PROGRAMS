package SDET_Java_Programs;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialUsingRecurrsion {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = s.nextInt();
        s.close(); // It's good practice to close the Scanner when done using it.

        BigInteger result = factorial(BigInteger.valueOf(a));
        System.out.println(result);
        
    }

    private static BigInteger factorial(BigInteger a) {
        if (a.equals(BigInteger.ZERO) || a.equals(BigInteger.ONE)) {
            return BigInteger.ONE; // Factorial of 0 and 1 is 1.
        } else {
            return a.multiply(factorial(a.subtract(BigInteger.ONE)));
            
        }
    }
}
