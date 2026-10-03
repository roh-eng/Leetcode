class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> res=new HashSet<>();
        HashSet<Integer> res1=new HashSet<>();

        for(int j=0;j<nums1.length;j++){
            // if(res.contains(nums1[j])){
                res.add(nums1[j]);
            // }
        }
        for(int i=0;i<nums2.length;i++){
            if(res.contains(nums2[i])){
                res1.add(nums2[i]);
            }
        }
        int k=0;
        int arr[]=new int[res1.size()];
        for(int num :res1){
            arr[k++]=num;
        }
        return arr;
    }
}