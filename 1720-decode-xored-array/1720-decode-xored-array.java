class Solution {
    public int[] decode(int[] encoded, int first) {
        
        int r[]=new int[encoded.length+1];
        r[0]=first;
        for(int j=0;j<encoded.length;j++){
            r[j+1]=r[j]^encoded[j];
        }
        return r;
    }
}