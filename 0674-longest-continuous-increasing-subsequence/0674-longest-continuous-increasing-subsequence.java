class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1;
        int m=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                c++;
            }else{
                c=1;
            }
            m=Math.max(m,c);
        }
        return m;
    }
}