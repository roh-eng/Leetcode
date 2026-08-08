class Solution {
    public int firstMatchingIndex(String s) {
        char[] sl =s.toCharArray();
        int n=sl.length;
        int count=0;
        int i=0;
        
        while(i<n){
            if(sl[i]==sl[n-i-1]){
                return i;
               
            }
            i++;
        }
        return -1;
    }
}