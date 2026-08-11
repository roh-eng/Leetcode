class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        digits=Counter(str(n))
        total=0
        for digit,count in digits.items():
            d=int(digit)
            total=total+(d*count)
        return total