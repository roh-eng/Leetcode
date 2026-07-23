class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int bestCount = -1;
        int bestDivisor = Integer.MAX_VALUE;

        for (int i = 0; i < divisors.length; i++) {
            int currentCount = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % divisors[i] == 0) {
                    currentCount++;
                }
            }

            if (currentCount > bestCount) {
                bestCount = currentCount;
                bestDivisor = divisors[i];
            } else if (currentCount == bestCount) {
                bestDivisor = Math.min(bestDivisor, divisors[i]);
            }
        }

        return bestDivisor;
    }
}