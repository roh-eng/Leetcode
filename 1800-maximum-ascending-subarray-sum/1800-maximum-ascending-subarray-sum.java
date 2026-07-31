class Solution {
    public int maxAscendingSum(int[] nums) {
        int cursum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cursum+=nums[i];
            }else{
                cursum=nums[i];
                
            }
            maxsum=Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}