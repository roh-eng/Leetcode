class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        int leftsum=0;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int right=totalsum-leftsum-nums[i];
            ans[i]=Math.abs(leftsum-right);
            leftsum += nums[i];

        }
        return ans;
    }
}