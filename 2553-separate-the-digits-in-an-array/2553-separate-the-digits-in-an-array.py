class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        l=[]
        for i in nums:
            for digit in str(i):
                l.append(int(digit))
        return l