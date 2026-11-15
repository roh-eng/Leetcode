class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int c=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=nums.get(j);
            int len = j - i + 1;
            if (len >= l && len <= r && sum > 0) {
                c=Math.min(sum,c);
                }
            }
        }
        if(c==Integer.MAX_VALUE)    return -1;
        return c;
    }
}