class Solution {
    public int minElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]!=0){
                int last=nums[i]%10;
                sum=sum+last;
                nums[i]=nums[i]/10;

            }
            nums[i]=sum;
        }
        int minVal = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
        }
        
        return minVal;
    }
}