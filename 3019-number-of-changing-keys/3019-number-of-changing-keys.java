class Solution {
    public int countKeyChanges(String s) {
        String x=s.toLowerCase();
        char[] xlist=x.toCharArray();
        int count=0;
        for(int i=0;i<xlist.length-1;i++){
            if(xlist[i]!=xlist[i+1]){
                count++;
            }
        }
        return count;
    }
}