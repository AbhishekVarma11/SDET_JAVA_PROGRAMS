package SDET_Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSUM {
    public static void main(String args[]) {
        int a[] = {3, 2, 7, 1, 4};
        int sum = 5;
        int low = 0;
        int high = a.length - 1;
        List<List<Integer>> pairs = new ArrayList<>();
        Arrays.sort(a);
        
        while (low < high) {
            int currentSum = a[low] + a[high];
            if (currentSum == sum) {
                List<Integer> pair = new ArrayList<>();
                pair.add(a[low]);
                pair.add(a[high]);
                pairs.add(pair);
                low++;
                high--;
            } else if (currentSum < sum) {
                low++;
            } else {
                high--;
            }
        }
        
        // Print pairs
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
        System.out.println(pairs);
    }
}
