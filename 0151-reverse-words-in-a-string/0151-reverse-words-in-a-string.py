class Solution:
    def reverseWords(self, s: str) -> str:
        x=s.split()
        r=x[::-1]
        return ' '.join(r)