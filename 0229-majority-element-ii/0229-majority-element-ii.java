class Solution {
    public List<Integer> majorityElement(int[] nums) {
            int el1 = 0, el2 = 0, c1 = 0, c2 = 0;
        
        for (int num : nums) {
            if (num == el1) {
                c1++;
            } else if (num == el2) {
                c2++;
            } else if (c1 == 0) {
                el1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                el2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        
        c1 = 0;
        c2 = 0;
        for (int num : nums) {
            if (num == el1) c1++;
            else if (num == el2) c2++;
        }
        
        List<Integer> result = new ArrayList<>();
        if (c1 > nums.length / 3) result.add(el1);
        if (c2 > nums.length / 3) result.add(el2);
        
        return result;
    }
}