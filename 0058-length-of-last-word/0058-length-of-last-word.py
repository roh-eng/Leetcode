class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        x=s.split()
        l=len(x)
        return len(x[l-1])
        