class Solution {
    public int minimumSwaps(int[] nums) {
        int c = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0){
                c++;
            }
        }
        int swaps=0;
        int b=nums.length-c;
        for(int i=0;i<b;i++){
            if(nums[i]==0) swaps++;
        }
        return swaps;
    }
}