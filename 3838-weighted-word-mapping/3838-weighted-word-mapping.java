class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result=new StringBuilder();
        for(String word: words){
            int sum=0;
            for(int k=0;k<word.length();k++){
                char c=word.charAt(k);
                int ci=c-'a';
                sum+=weights[ci];
            }
            int mv=sum%26;
            char mc=(char)('z'-mv);
            result.append(mc);

        }
        return result.toString();
    }
}