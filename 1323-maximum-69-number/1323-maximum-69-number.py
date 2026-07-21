class Solution:
    def maximum69Number (self, num: int) -> int:
        x=list(str(num))
        for i in range(len(x)):
            if x[i]=='6':
                x[i]='9'
                break
        c=int("".join(x))
        return c
