class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int small = nums1[0];
        int small1=nums2[0];
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < small) {
                small = nums1[i];
                index = i;
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] < small1) {
                small1 = nums2[i];
                index = i;
            }
        }
        int x=small1-small;
        return x;
    }
}