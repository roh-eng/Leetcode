class Solution {
    public int totalHammingDistance(int[] nums) {
        int l=nums.length;
        int sum=0;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(i!=j){
                    
                    sum=sum+Integer.bitCount(nums[i]^nums[j]);
                }
            }
        }
        return sum;
    }
}