class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=nums.length;
        int count=0;
        if(l==0) return 0;
        
        for(int i=0;i<l;i++){
            int sum=0;
            for(int j=i;j<l;j++){
                sum+=nums[j];
                
            
            if(sum==k){
                count++;
            }
            }
        }
        return count;
    }
}