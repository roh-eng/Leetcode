class Solution:
    def reverseWords(self, s: str) -> str:
        r=s.split()
        x=[]
        for i in r:
            i=i[::-1]
            x.append(i)
        return ' '.join(x)
        