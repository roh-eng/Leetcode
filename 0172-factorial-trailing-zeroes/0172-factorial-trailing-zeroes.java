class Solution {
    public int trailingZeroes(int n) {

        int tc=0;
        while(n>0){
            n=n/5;
            tc+=n;
            
        }
        return tc;
    }
}