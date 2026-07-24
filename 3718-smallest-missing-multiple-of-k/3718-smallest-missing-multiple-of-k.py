class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        c=1
        for i in range(len(nums)):
            if k*c in nums:
                c+=1
        return c*k 