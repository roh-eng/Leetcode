class Solution {
    public boolean checkGoodInteger(int n) {
        int digit_sum=0;
        int square_sum=0;
        while(n!=0){
            int last=n%10;
            digit_sum+=last;
            square_sum=(last*last) + square_sum;
            n=n/10;
        }
        if((square_sum-digit_sum)>=50){
            return true;
        }
        return false;
    }
}