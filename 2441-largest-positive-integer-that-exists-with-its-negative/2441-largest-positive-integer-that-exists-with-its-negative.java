import java.util.*;
class Solution {
    public int findMaxK(int[] nums) {
        int ans=-1;
       HashSet<Integer> hs = new HashSet<>();
       for(int num:nums){
            hs.add(num);
            int k=num*(-1);
            if(hs.contains(k)){
                ans = Math.max(ans, Math.abs(num));
                
            }
       }
       return ans;
       
    }
}