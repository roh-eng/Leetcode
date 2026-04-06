import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();

        int maxi = nums[0];
        int mini = nums[0];
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num > maxi) maxi = num;
            if (num < mini) mini = num;
            set.add(num);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = mini; i <= maxi; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}