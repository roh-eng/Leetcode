class Solution {
    public boolean digitCount(String num) {
        int has[]=new int[10];
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            has[digit]+=1;
        }
        for (int i = 0; i < num.length(); i++) {
            int d = num.charAt(i)-'0';
            if (d != has[i]) {
                return false;
            }
        }
        return true;
    }
}