class Solution {
    public boolean canAliceWin(int n) {
        int r=10;
        int x=0;
        while(n>=r){
            n=n-r;
            r--;
            x++; 

        }
        return x%2!=0;
    }
}