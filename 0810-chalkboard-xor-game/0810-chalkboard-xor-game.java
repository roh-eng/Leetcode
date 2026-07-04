class Solution {
    public boolean xorGame(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total^(nums[i]);
            
        }
        if(total==0 || nums.length%2==0){

                return true;
            }
        return false;  
    }
}