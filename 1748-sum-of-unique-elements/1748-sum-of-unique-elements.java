import java.util.*;

class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Add only unique numbers to sum
        for (int num : nums) {
            if (freq.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }
}
