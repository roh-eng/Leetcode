import java.util.*;
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int product=Math.abs((nums[0]*nums[1]) - (nums[nums.length-1]*nums[nums.length-2]));
        return product;
    }
}