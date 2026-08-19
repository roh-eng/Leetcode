class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int sum=0;
            int temp=i;
            while(temp!=0){
                int last=temp%10;
                sum=sum+last;
                temp=temp/10;
            }
            res.put(sum,res.getOrDefault(sum,0)+1);
        }
        int maxi=Integer.MIN_VALUE;
        for(Integer value:res.values()){
            maxi=Math.max(value,maxi);
        }
        return maxi;
    }
}