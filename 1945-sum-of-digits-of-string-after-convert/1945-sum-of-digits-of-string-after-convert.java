class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str_int = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            str_int.append((int)c-96);
        }
        String int_str=str_int.toString();
        int sum=0;
        while(k!=0){
            sum=0;
            for(int i=0;i<int_str.length();i++){
            sum+=int_str.charAt(i)-'0';
        }
        
        int_str = String.valueOf(sum);
        k--;
        }
        return sum;
    }
}