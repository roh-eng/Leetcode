class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int digitCount = 0;
            int num = nums[i];
            
            while(num != 0) {
                digitCount++;
                num = num / 10;
            }
            
            if(digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}