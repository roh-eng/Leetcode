class Solution {
    public int earliestTime(int[][] tasks) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++){
            int rowsum=0;
            for(int j=0;j<tasks[i].length;j++){
                rowsum+=tasks[i][j];
            }
                if(mini>rowsum){
                    mini=rowsum;
                
            }
        }
        return mini;
    }
}