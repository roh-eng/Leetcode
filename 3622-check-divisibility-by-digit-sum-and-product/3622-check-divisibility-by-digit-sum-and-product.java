class Solution {
    public boolean checkDivisibility(int n) {
        int x=n;
        int sum=0;
        int prod=1;
        while(n!=0){
            int last=n%10;
            sum=sum+last;
            prod=prod*last;
            n=n/10;
        }
        if(x%(sum+prod)==0){
            return true;
        }
        return false;
    }
}