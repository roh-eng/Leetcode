class Solution {
    public int smallestIndex(int[] nums) {
        int last=0;
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                last=nums[i]%10;
                sum=sum+last;
                nums[i]=nums[i]/10;
            }
            if(sum==i){
                return i;
            }
            
        }
        return -1;
    }
}