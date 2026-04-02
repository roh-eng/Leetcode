class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if((nums[i]-nums[j])==k){
                    count++;
                }
            }
        }
        return count;
    }
}