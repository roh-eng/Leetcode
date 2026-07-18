class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small=nums[0];
        int large=nums[nums.length-1];
        while (large!=0){
            int rem=small%large;
            small=large;
            large=rem;
        }
        return small;
    }
}