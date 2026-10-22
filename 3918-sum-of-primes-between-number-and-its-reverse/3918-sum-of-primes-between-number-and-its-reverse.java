class Solution {
    boolean isPrime(int k) {
        if (k < 2) return false;
        for (int i = 2; i < k; i++) {
            if (k % i == 0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int s=n;
        int reverse=0;
        while(n!=0){
            int last=n%10;
            reverse=reverse*10+last;
            n=n/10;
        }
        int sum=0;
        int lo = Math.min(s, reverse); 
        int hi = Math.max(s, reverse);
        for(int i=lo;i<=hi;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}