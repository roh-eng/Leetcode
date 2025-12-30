class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        n=str(x)
        sum=0
        for i in range(len(n)):
            sum=sum+int(n[i])
        if(x%sum==0):
            return sum
        else:
            return -1