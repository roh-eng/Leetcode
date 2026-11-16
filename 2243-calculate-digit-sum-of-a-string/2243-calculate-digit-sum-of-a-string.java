class Solution {
    public String digitSum(String s, int k) {
        if(s.length()<k) return s;
        while(s.length()>k){
            StringBuilder st=new StringBuilder();
            int sum=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                int num=c-'0';
                sum+=num;
                if(((i+1)%k==0) || i==(s.length()-1)){
                    st.append(sum);
                    sum=0;
            
            }
        }
        s=st.toString();
        }
       return s;
    }
}