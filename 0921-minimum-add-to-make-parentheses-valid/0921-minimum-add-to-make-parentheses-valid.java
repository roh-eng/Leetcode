class Solution {
    public int minAddToMakeValid(String s) {
        int opb=0;
        int moves=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                opb++;
            }else if (c==')'){
                if(opb>0){
                    opb--;
                }else if(opb==0){
                    moves++;
                }
            }
        }
        return opb+moves;
    }
}