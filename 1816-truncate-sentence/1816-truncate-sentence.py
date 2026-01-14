class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        x=s.split()
        result=' '.join(x[:k])
        return result