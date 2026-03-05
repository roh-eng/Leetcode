import re
class Solution:
    def numDifferentIntegers(self, word: str) -> int:
        digits = re.findall(r'\d+', word)
        unq={int(d) for d in digits}
        return len(unq)
                