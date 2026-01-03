class Solution {
    public int digitsum(int num){
        
        int sum=0;
        while(num!=0)
        {
            int last=num%10;
            sum=sum+last;
            num=num/10;
        }
        return sum;
    }
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(digitsum(i)%2==0){
                count++;
            }
        }
        return count;
    }
}