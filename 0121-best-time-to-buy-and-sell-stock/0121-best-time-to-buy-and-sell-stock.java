class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        int mini=prices[0];
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-mini;
            pro=Math.max(pro,cost);
            mini=Math.min(mini,prices[i]);
        }
        return pro;
    }
}