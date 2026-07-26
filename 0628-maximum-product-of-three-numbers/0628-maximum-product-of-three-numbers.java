class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0]*nums[1]*nums[nums.length-1];
        
        int b =nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        
        if(a>b){
            return a;
        }
        return b;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int prod=1;
        //     for(int j=0;j<nums.length;j++){
        //         for(int k=0;k<nums.length;k++){
        //             prod=nums[i]*nums[j]*nums[k];
        //             max=Math.max(max,prod);
        //         }
        //     }
        // }
        // return max;
    }
}