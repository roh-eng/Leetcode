class Solution {
    public long removeZeros(long n) {
        String s=String.valueOf(n);
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='0'){
                st.append(c);
            }
        }
        String x=st.toString();
        return Long.parseLong(x);
    }
}