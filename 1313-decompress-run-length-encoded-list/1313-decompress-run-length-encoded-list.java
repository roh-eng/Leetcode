class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> r=new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int value=nums[i+1];
            int freq=nums[i];
            while(freq!=0){
                r.add(value);
                freq--;
            }
        }
        int []res=new int[r.size()];
        for(int i=0;i<r.size();i++){
            res[i]=r.get(i);
        }
        return res;
    }
}