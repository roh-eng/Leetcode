class Solution {
    public int minimumDifference(int[] nums, int k) {
        int l=nums.length;
        if(l==0 || l==1){
            return 0;
        }
        Arrays.sort(nums);
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<=l-k;i++){
            int dif=nums[i+k-1]-nums[i];
            // for(int j=l-1;j>=0;j--){
                mini=Math.min(mini,dif);
            // }
        }
        return mini;
    }
}