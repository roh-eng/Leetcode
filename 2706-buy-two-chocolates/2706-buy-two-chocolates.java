class Solution {
    public int buyChoco(int[] prices, int money) {
        // int count=2;
        
        // while(count!=0){
        //     for(int i=0;i<prices.length;i++){
        //         if(count!=0){
        //             if(prices[i]<money){
        //             money=money-prices[i];
        //             count--;
        //         }
        //         }
        //         // if(money<prices[i]){
        //         //     continue;
        //         // }
        //     }
        // }
        Arrays.sort(prices);
        int d=prices[0] + prices[1];
        if(d<=money){
            return money-d;
        }
        return money;
    }
}