class Solution {
    public long sumDigitDifferences(int[] nums) {
        int n = nums.length;
        long ans = 0;
        while (nums[0] > 0) {                       
            int[] cnt = new int[10];
            for (int i = 0; i < n; i++) {
                cnt[nums[i] % 10]++;
                nums[i] /= 10;                      
            }
            long totalPairs = (long) n * (n - 1) / 2;
            long samePairs = 0;
            for (int c : cnt) samePairs += (long) c * (c - 1) / 2;
            ans += totalPairs - samePairs;
        }
        return ans;
    }
}