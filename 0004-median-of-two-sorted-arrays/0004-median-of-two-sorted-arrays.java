class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a=nums1.length;
        int b=nums2.length;
        int x=a+b;
        int c[]=new int [x];
        for(int i=0;i<a;i++){
            c[i]=nums1[i];
        }
        for(int j=0;j<b;j++){
            c[a+j]=nums2[j];

        }
Arrays.sort(c);

        int n = c.length;
        if (n % 2 == 1) {
            return c[n / 2];
        } else {
            return (c[n / 2 - 1] + c[n / 2]) / 2.0;
        }
}
}