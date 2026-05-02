class Solution {
    public int minOperations(int[] nums) {
        int q = 0;
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i+1] <= nums[i]) {
                int diff = nums[i] - nums[i+1] + 1;
                nums[i+1] += diff;
                q += diff;
            }
        }
        
        return q;
    }
}