class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int reverse=0;
            int t=nums[i];
            while(t!=0){
                int last=t%10;
                reverse=reverse*10+last;
                t=t/10;
            }
            n[i]=reverse;
        }
        HashSet<Integer> distinct = new HashSet<>();
        for (int num : nums) {
            distinct.add(num);           
        }
        for (int num : n) {
            distinct.add(num);           
        }
        return distinct.size();
    }
}