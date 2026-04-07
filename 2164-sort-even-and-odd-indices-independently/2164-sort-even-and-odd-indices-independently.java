import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int l = nums.length;
        
        int[] ea = new int[(l + 1) / 2];
        int[] oa = new int[l / 2];
        
        int eIdx = 0;
        int oIdx = 0;
        
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                ea[eIdx++] = nums[i];
            } else {
                oa[oIdx++] = nums[i];
            }
        }
        
        Arrays.sort(ea);
        
        Arrays.sort(oa);
        for (int i = 0; i < oa.length / 2; i++) {
            int temp = oa[i];
            oa[i] = oa[oa.length - 1 - i];
            oa[oa.length - 1 - i] = temp;
        }
        
        eIdx = 0;
        oIdx = 0;
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                nums[i] = ea[eIdx++];
            } else {
                nums[i] = oa[oIdx++];
            }
        }
        
        return nums;
    }
}