class Solution:
    def countSymmetricIntegers(self, low: int, high: int) -> int:
        c=0
        for i in range(low,high+1):
            x=list(str(i))
            if len(x)%2==0:
                sum1=0
                sum2=0
                
                mid=len(x)//2
                for num in range(mid):
                    sum1=sum1+int(x[num])
                for num in range(mid,len(x)):
                    sum2 =sum2+int(x[num])

                if sum1==sum2:
                    c+=1
        return c
    