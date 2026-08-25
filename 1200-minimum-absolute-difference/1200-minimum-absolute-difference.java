class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int m=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            if(m>diff){
                m=diff;
            }
        }


      List<List<Integer>> res=new ArrayList<>();
        
        for(int j=0;j<arr.length-1;j++){
            List<Integer> res1=new ArrayList<>();
            
                if((arr[j+1]-arr[j])==m){
                    res1.add(arr[j]);
                    res1.add(arr[j+1]);

                    res.add(res1);
                }
            }
            
        
        return res;
    }
}