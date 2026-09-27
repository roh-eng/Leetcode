class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> result=new ArrayList<>();
        int pointer=0;
        for(int i=1;i<=n && pointer<target.length;i++){
            
            if(i==target[pointer]){ 
                result.add("Push");
                pointer++;

            }else{ 
                result.add("Push");
                result.add("Pop");
            }

        }
        return result;
    }
}