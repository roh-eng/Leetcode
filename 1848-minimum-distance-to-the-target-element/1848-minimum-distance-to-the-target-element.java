class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDist = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int currentDist = Math.abs(i - start);
                if (currentDist < minDist) {
                    minDist = currentDist;
                }
               
                if (minDist == 0) return 0;
            }
        }
        
        return minDist;
    }
}