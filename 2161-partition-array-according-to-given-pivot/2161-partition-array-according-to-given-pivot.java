class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                res.add(nums[i]);
            }
        }
        for (int num : nums) {
            if (num == pivot) {
                res.add(num);
            }
        }
            for(int j=0;j<nums.length;j++){
                if(nums[j]>pivot){
                    res.add(nums[j]);
                }
            }
        
        
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}