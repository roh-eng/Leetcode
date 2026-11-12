class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        int m=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }else{
                count=1;
            }
            m=Math.max(count,m);
        }
        int mcount=1;
        int md=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                mcount++;
            }else{
                mcount=1;
            }
            md=Math.max(md,mcount);
        }
        return Math.max(m,md);
    }
}