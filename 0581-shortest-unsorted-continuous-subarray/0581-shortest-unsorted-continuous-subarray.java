class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int ans=0;
        int lo=0;
        int hi=-1;
        int maxs=Integer.MIN_VALUE;
        int mins=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            maxs=Math.max(nums[i],maxs);
            if(nums[i]<maxs){
                hi=i;
            }
            int j=nums.length-1-i;
            mins=Math.min(nums[j],mins);
            if(nums[j]>mins){
                lo=j;
            }
        }
        return hi-lo+1;
    }
}