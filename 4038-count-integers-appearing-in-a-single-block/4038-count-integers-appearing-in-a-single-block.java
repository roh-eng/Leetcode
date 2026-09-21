class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;

        HashSet<Integer> seen=new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            int target=nums[i];
            if(seen.contains(target)){
                continue;
            }
            seen.add(target);
            int firstindex=-1;
            int lastindex=-1;

            for(int j = 0; j <nums.length  ; j++) {
                if(nums[j] == target) {
                    firstindex=j;
                    break;
                }
            }

            for(int j = nums.length - 1; j >= 0; j--) {
                if(nums[j] == target) {
                    lastindex=j;
                    break;
                }
            }
            boolean sp=true;
            for(int j=firstindex;j<=lastindex;j++){
                if(nums[j]!=target){
                    sp=false;
                    break;
                }
            }
            if(sp==true){
                count++;
            }
        }
        return count;
    }
}