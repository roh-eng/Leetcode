class Solution:
    def smallestRangeI(self, nums: List[int], k: int) -> int:
        maximum=max(nums)
        minimum=min(nums)
        return max(0,(maximum-minimum)-2*k)