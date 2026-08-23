class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
       
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                int sum =nums[i]+nums[j];
                int left=j+1;
                int right=nums.length-1;
                while(left<=right){
                    int mid=left+(right-left)/2;
                    if(nums[mid]<sum){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }
                }
                count+=right-j;

            }
        }
        return count;
    }
}