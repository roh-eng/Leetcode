class Solution {
    public int findFinalValue(int[] nums, int original) {
        int l= nums.length;
        while(l-->0){
        {
            for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original=original*2;
            }
        }
        }
        
    }
    return original;
    }
}