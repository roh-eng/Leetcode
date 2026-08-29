class Solution {
    public int[] beautifulArray(int n) {
        if(n==1){
            return new int[]{1};
        }
        int arr[]=beautifulArray((n+1)/2);
        int arr1[]=beautifulArray(n/2);
        int res[]=new int[n];
        int idx=0;
        for(int x:arr){
            res[idx++]= 2*x-1;
        }
        for(int x: arr1){
            res[idx++]=2*x;
        }
        return res;
    }
}