class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int range = Math.abs(nums[n-1] - nums[2]);
        int range1 = Math.abs(nums[n-3] - nums[0]);
        int range2 = Math.abs(nums[n-2] - nums[1]);
        
        return Math.min(range,Math.min(range1,range2));
    }
}