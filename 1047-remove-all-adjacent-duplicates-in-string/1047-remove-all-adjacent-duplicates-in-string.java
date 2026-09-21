class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> r=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            // r.push(s[i]);
            if( !r.isEmpty() && r.peek() == c){
                r.pop();
            }else{
                r.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char x:r){
            sb.append(x);
        }
        return sb.toString();
    }
}