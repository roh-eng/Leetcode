class Solution {
   public int firstUniqueEven(int[] nums) {
    Map<Integer, Integer> count = new HashMap<>();
    
    for (int num : nums) {
        count.put(num, count.getOrDefault(num, 0) + 1);
    }
    
    for (int num : nums) {
        if (num % 2 == 0 && count.get(num) == 1) {
            return num;
        }
    }
    
    return -1;
}
}