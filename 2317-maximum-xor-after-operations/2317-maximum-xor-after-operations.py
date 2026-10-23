class Solution:
    def maximumXOR(self, nums: list[int]) -> int:
        result=0
        for i in range(len(nums)):
            result =result | nums[i]
        return result