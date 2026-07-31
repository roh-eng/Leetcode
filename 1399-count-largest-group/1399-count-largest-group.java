class Solution {
    public int digitsum(int n)
    {   int sum=0;
        if(n<10){
        return n;
        }
        while (n>0)
        {
        int last=n%10;
        sum=sum+last;
        n=n/10;
        }
        return sum;
    }

    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> res= new HashMap<>();
        for(int i=1;i<=n;i++){
                int k=digitsum(i);
                res.put(k, res.getOrDefault(k, 0) + 1);
            }
        int max = 0;

        for (int value : res.values()) {
            if (value > max) {
                max = value;
            }
        }
        int count=0;
        for (int value : res.values()) {
           
            if(max==value){
                count++;
            }
        }
        
        
        return count;
    }
}