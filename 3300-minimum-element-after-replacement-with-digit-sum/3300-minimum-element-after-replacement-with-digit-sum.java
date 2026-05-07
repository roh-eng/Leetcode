class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int lastdigit=0;
            int temp=nums[i];
            while(temp>0){
                lastdigit = temp%10;
                sum=sum+lastdigit;
                temp=temp/10;
            }
            nums[i]=sum;
        }
        return Arrays.stream(nums).min().getAsInt();
    }
}