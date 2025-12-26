class Solution {
    public int bestClosingTime(String customers) {
        int penalty=0,best_p=0,ans=0;
        char[]ch=customers.toCharArray();
        for(int i=0;i<customers.length();i++){
            if(ch[i]=='Y'){
                penalty--;
            
            if(penalty<best_p){
                best_p=penalty;
                ans=i+1;
            }
        }else
            penalty++;
        }
        return ans;
    }
}