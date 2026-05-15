class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for (int num : nums) {
            if(num%2==0){
                res.put(num, res.getOrDefault(num, 0) + 1);
                }
        }
        int result=-1;
        int maxFreq=0;
        for(Map.Entry<Integer,Integer> entry: res.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            if(freq>maxFreq || (freq==maxFreq && num<result)){
                result=num;
                maxFreq=freq;
            }
        }
       return result; 
    }
}