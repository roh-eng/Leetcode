class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[]=new int[num_people];
        int give=1;
        while(candies>0){
            for(int i=0;i<num_people;i++){
                int actual = Math.min(give, candies);

                arr[i]+=actual;
                
                candies=candies-actual;
                give++;
            }
        }
        return arr;
    }
}