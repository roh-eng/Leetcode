class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int z=n*n;
        for(int i=z;i>0;i--){
            if((z*w)>maxWeight){
                z--;
            }
        }
        return z;
    }
}