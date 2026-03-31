class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int l= operations.length;
        int res=0;
        for(int i=0;i<l;i++){
            
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                res--;
            }
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                res++;
            }
        }
        return res;
    }
}