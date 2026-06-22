class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> res=new HashMap<>();
        
        for(char c:text.toCharArray()){
            res.put(c,res.getOrDefault(c,0)+1);
        }
        int b=res.getOrDefault('b',0);
        int a=res.getOrDefault('a',0);
        int n=res.getOrDefault('n',0);
        int l=res.getOrDefault('l',0)/2;
        int o=res.getOrDefault('o',0)/2;
        return Math.min(Math.min(Math.min(b,a),Math.min(l,o)),n);


    }
}