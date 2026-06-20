class Solution {
    public int[] shuffle(int[] nums, int n) {
        int mid = nums.length / 2;

        int[] first = Arrays.copyOfRange(nums, 0, mid);
        int[] second = Arrays.copyOfRange(nums, mid, nums.length);
        
        int []res=new int[nums.length];
        for(int i=0;i<n;i++){
            res[2*i]=first[i];
            res[2*i+1]=second[i];
        }
        return res;
    }
}