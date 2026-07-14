class Solution:
    def minImpossibleOR(self, nums: List[int]) -> int:
        nums.sort()
        x=1
        for i in nums:
             if i==x:
                x*=2
        return x