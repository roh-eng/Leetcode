import java.util.Arrays;

class Solution {
    static int daysRequired(int capacity, int[] weights) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                days = days + 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int req = daysRequired(mid, weights);
            if (req <= days) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}