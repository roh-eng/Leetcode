class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0;
        int a1=x;
        while(x>0){
            int a=x%10;
            rev=rev*10+a;
            x=x/10;
        }
        if(a1==rev){
            return true;
        }else{
            return false;
        }
        
    }
}