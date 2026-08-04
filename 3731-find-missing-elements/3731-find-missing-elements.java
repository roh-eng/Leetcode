class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        Arrays.sort(nums);
        int mini=nums[0];
        int maxi=nums[nums.length-1];
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=mini;i<maxi;i++){
            if(!set.contains(i)){
                result.add(i);
            }
            
        }
        return result;
    }
}