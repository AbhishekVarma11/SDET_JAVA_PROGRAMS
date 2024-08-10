package SDET_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfArray {
    public static void main(String[] args) {
    	int[] arr = {4, -1, 2, 1};
        List<List<Integer>> subsets = generateSubsets(arr);
        subsets.remove(0); // Removing the empty subset
        int maxSum = Integer.MIN_VALUE;
        for (List<Integer> ele : subsets) {
            System.out.println(ele);
        }
        
        for (List<Integer> subset : subsets) {
            int sum = sumOfSubset(subset);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println("Maximum subset sum: " + maxSum);
    }

    private static int sumOfSubset(List<Integer> subset) {
        int sum = 0;
        for (int ele : subset) {
            sum += ele;
        }
        return sum;
    }

    private static List<List<Integer>> generateSubsets(int[] arr) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>()); // Start with the empty subset
        for (int num : arr) {
            int n = subsets.size();
            for (int i = 0; i < n; i++) {
                List<Integer> currentSubset = new ArrayList<>(subsets.get(i));
                currentSubset.add(num);
                subsets.add(currentSubset);
            }
        }
        return subsets;
    }
}
