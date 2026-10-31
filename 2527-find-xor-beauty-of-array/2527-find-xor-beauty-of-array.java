class Solution {
    public int xorBeauty(int[] nums) {
        int n=nums.length;
        int r=0;
      
                for(int k=0;k<n;k++){
                    
                    r=r^nums[k];
                }
            
        return r;
    }
}