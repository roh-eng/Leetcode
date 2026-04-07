class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            
            int prev = i - 1;
            while (prev >= 0 && nums[prev] == nums[i]) {
                prev--;
            }
            
            if (prev < 0) continue;
            
            if ((nums[i] > nums[prev] && nums[i] > nums[i + 1]) || 
                (nums[i] < nums[prev] && nums[i] < nums[i + 1])) {
                count++;
            }
        }
        return count;
    }
}