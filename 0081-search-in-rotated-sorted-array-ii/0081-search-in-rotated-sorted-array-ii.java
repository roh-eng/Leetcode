import java.util.*;

class Solution {
    public boolean search(int[] nums, int k) {
        Set<Integer> set1 = new HashSet<>();
        for(int num : nums) {
            set1.add(num);
        }
        return set1.contains(k);
    }
}