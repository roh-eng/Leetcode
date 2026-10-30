class Solution {
    public int maxDigitRange(int[] nums) {
        int n=nums.length;
        int[] ranges = new int[n];
        int maxRange =0;
        for(int i=0;i<n;i++){
            int large=0;
            int small=Integer.MAX_VALUE;
            int temp=nums[i];
            if (temp == 0) {
                ranges[i] = 0;
                maxRange = Math.max(maxRange, 0);
                continue;
            }
            while(temp>0){
                int last=temp%10;
                large=Math.max(last,large);
                small=Math.min(last,small);
                temp=temp/10;
            }
            int dr=Math.abs(large-small);
            ranges[i]=dr;
            maxRange = Math.max(maxRange, dr);
        }
            int sum = 0;
            for(int i = 0; i < n; i++) {
                if (ranges[i] == maxRange) {
                    sum += nums[i];
                }
            }
        
        
        return sum;
    }
}