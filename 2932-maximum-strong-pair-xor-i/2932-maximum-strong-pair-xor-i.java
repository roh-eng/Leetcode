class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int x=0;
                    int maxi=0;

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j]))){
                   x= nums[i]^nums[j];
                   if(maxi<x){
                    maxi=x;
                   }
                }
            }
        }
        return maxi;
    }
}