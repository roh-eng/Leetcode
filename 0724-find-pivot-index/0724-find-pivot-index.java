class Solution {
    public int pivotIndex(int[] nums) {
            int leftsum=0;
            int totalsum=0;
            int rightsum=0;
            for(int j=0;j<nums.length;j++){
                 totalsum=totalsum+nums[j];
            }
            for(int i=0;i<nums.length;i++){
                rightsum=totalsum-leftsum-nums[i];
                if(leftsum==rightsum){
                return i;
            }
            leftsum+=nums[i];
        
            }
            
        return -1;
    }
}