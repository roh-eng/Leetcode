class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int f=i-k;
            int l=i+k;
            boolean leftOk  = (f  < 0) || (nums[f]  < nums[i]);
            boolean rightOk = (l >= nums.length) || (nums[l] < nums[i]);

            if (leftOk && rightOk) {
                sum += nums[i];
            }
        }
        
        return sum;
    }
}