class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=people.length;
        int c=0;
        Arrays.sort(people);
        int left=0;
        int right=l-1;

        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
                right--;
            }else{
                right--;
                
            }
            c++;
        }
        return c;
    }
}