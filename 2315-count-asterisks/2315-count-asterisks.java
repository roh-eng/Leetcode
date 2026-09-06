class Solution {
    public int countAsterisks(String s) {
        int c=0;
        boolean inside=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                inside=!inside;
            }
            else if(!inside && s.charAt(i)=='*'){
                c+=1;
            }
        }
        return c;
    }
}