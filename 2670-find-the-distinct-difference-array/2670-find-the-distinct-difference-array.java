import java.util.Set;
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        int first=0;
        for(int k=0;k<len;k++){
            HashSet<Integer> prefix=new HashSet<>();
            HashSet<Integer> suffix=new HashSet<>();
            for(int i=0;i<=first;i++){
                prefix.add(nums[i]);
            }
            for(int j=first+1;j<len;j++){
                suffix.add(nums[j]);
            }
            first++;
            res[k]=(prefix.size()-suffix.size());
        }
        return res;
    }
}