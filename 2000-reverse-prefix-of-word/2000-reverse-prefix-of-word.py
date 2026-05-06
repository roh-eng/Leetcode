class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        x = list(word)
        for i in range(len(x)):
            if x[i] == ch:
                x = x[:i+1][::-1] + x[i+1:]
                break
        return ''.join(x)
