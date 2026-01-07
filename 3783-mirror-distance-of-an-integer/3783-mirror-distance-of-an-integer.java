class Solution {
    public int mirrorDistance(int n) {
        int reverse=0;
        int x=n;
        while(n>0)
        {
        int last=n%10;
        reverse=last+(reverse*10);
        n=n/10;
        }
        int res=Math.abs(x-reverse);
        return res;
    }
}