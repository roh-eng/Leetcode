import java.util.*;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxVal = Arrays.stream(nums).max().getAsInt();
        int left = 1;
        int right = maxVal;
        int result = maxVal;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int currentSum = 0;
            for (int num : nums) {
                currentSum += (num + mid - 1) / mid;
            }

            if (currentSum <= threshold) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}