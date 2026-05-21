import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] freq = new int[101];
        int maxFreq = 0;

        for (int num : nums) {
            freq[num]++;

            if (freq[num] > maxFreq) {
                maxFreq = freq[num];
            }
        }

        int total = 0;

        for (int count : freq) {
            if (count == maxFreq) {
                total += count;
            }
        }

        return total;
    }
}