class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        l=list(s)
        x=l[:k]
        rev=x[::-1]
        result=''.join(rev)+''.join(l[k:])
        return result