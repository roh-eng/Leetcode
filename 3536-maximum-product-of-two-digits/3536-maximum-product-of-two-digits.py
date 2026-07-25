class Solution:
    def maxProduct(self, n: int) -> int:
        x = [int(digit) for digit in str(n)]
        x.sort()
        if len(x)==2:
            return x[0]*x[1]
        elif len(x)>2:
            return x[len(x)-1]*x[len(x)-2]
                