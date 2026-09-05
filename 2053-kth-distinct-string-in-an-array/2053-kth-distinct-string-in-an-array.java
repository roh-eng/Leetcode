class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> res=  new HashMap<>();
        for(int i=0;i<arr.length;i++){
            res.put(arr[i],res.getOrDefault(arr[i],0)+1);
        }
        int dc=0;
        for(String s:arr){
            if(res.get(s)==1){
                dc++;
                if(dc==k){
                    return s;
                }
            }
        }
        return "";
    }
}