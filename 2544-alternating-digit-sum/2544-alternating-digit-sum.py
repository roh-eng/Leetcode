class Solution:
    def alternateDigitSum(self, n: int) -> int:
        x=str(n)
        sum=0
        for i in range(len(x)):
            if i%2==0:
                sum=sum+int(x[i])
            else:
                sum=sum-int(x[i])
        return sum

        