class Solution:
    def replaceDigits(self, s: str) -> str:
        x=list(s)
        for i in range(len(x)):
            if x[i].isdigit():
                prev=ord(x[i-1])
                dg=int(x[i])
                x[i]=chr(prev+dg)
           
        return "".join(x)
