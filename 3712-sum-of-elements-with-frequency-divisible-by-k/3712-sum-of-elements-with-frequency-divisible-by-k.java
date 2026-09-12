class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res.put(nums[i],res.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry: res.entrySet()){
            int key=entry.getKey();
            int count=entry.getValue();
            if(count%k==0){
                sum+=key*count;
            }
        }

        return sum;
    }
}