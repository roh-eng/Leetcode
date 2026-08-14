class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count=0;
        int sum=0;
        int sum1=0;
        int target=0;
        HashMap<Integer,Integer> res= new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                sum=nums1[i]+nums2[j];
                res.put(sum,res.getOrDefault(sum,0)+1);
            }
        }
        for(int k=0;k<nums3.length;k++){
            for(int l=0;l<nums4.length;l++){
                    sum1=nums3[k]+nums4[l];
                    target= -sum1;
                    if (res.containsKey(target)) {
                        count += res.get(target);
                    }
            }   
        }
        return count;
    }
}