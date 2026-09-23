class Solution:
    def hammingWeight(self, n: int) -> int:
        b_s=bin(n)[2:]
        c=0
        for i in range(0,len(b_s)):
            if b_s[i]=="1":
                c+=1
        return c