class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        if(n<3) return 0;
        int count=0;
        for(int i=0;i<n-2;i++){
            int fd=nums[i+1] - nums[i];
            for(int j=i+2;j<n;j++){
                if(nums[j]-nums[j-1]==fd){
                    count++;
                }else{
                    break;
                }
            }
        } 
        return count;
    }
}