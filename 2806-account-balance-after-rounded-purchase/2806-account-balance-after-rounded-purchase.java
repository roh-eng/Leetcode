class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        return (int) (100-Math.floor((purchaseAmount+5)/10)*10);
    }
}