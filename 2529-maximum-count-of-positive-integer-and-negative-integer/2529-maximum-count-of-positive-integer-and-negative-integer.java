class Solution {
    public int maximumCount(int[] nums) {
        int c1=0;
        int c2=0;
        for(int num:nums){
            if(num>0){
                c1++;
            }
            else if(num<0){
                c2++;
            } 
        }
        if(c1<c2){
            return c2;
        }else{
            return c1;
        }
    }
}