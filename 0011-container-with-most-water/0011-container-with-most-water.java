class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxi=0;
        while(l<r){
            int w=r-l;
            int mini=Math.min(height[l],height[r]);
            int cw=w*mini;
            maxi=Math.max(maxi,cw);
           if(height[l]<height[r]){
            l++;
           }else{
            r--;
           }
        }
        return maxi;
    }
}