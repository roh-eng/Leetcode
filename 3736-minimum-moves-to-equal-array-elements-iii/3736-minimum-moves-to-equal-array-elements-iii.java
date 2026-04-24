class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for (int num : nums) {
            maxi = Math.max(maxi, num);
        }
        for(int i=0;i<nums.length;i++){
            sum=sum+(Math.abs(nums[i]-maxi));
        }
        return sum;
    }
}