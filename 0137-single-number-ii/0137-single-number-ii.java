class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> r = new HashMap<>();
        for(int num:nums){
            r.put(num,r.getOrDefault(num,0)+1);

        }
        for(int key:r.keySet()){
            if(r.get(key)==1){
                return key;
            }
        }
        return -1;

    }
}