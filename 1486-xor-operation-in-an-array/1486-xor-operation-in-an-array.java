class Solution {
    public int xorOperation(int n, int start) {       int current,result=0;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
        current = start + 2 * i ;
        result = result ^ current;
       }
        return result;
    }
}