class Solution {
    public int minOperations(int[] nums, int x) {

        int tos=0;
        for(int i=0;i<nums.length;i++){
            tos+=nums[i];
        }


        int target=tos-x;

        if(target<0) return -1;
        if (target==0) return nums.length;

        int csum=0;
        int left=0;
        int maxlen=0;
        for(int right=0;right<nums.length;right++){
            csum=csum+nums[right];

            while(csum>target && left<=right){
                csum=csum-nums[left];
                left++;
            }

            if(csum==target) {
                maxlen=Math.max(maxlen,right-left+1);
            }
        }
        if(maxlen==0) return -1;
        return nums.length-maxlen;
    }
}