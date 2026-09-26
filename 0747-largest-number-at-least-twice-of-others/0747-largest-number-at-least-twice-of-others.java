class Solution {
    public int dominantIndex(int[] nums) {
        int ind=0;
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maximum){
                maximum=nums[i];
                ind=i;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j==ind) continue;
            
                if((2*nums[j])>maximum){
                return -1;
            }
        }
        
        return ind;
    }
}