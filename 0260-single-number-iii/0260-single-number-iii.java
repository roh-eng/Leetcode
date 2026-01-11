class Solution {
    public int[] singleNumber(int[] nums) {
        
        List<Integer> s = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
                if(c==1 && !s.contains(nums[i])){
                    s.add(nums[i]);
                }
            }
            int[]as=new int[s.size()];
            for(int i=0;i<s.size();i++){
                as[i]=s.get(i);
            }
            return as;
        }
        
    }
