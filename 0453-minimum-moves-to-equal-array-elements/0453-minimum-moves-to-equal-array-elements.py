class Solution:
    def minMoves(self, nums: List[int]) -> int:
        mini=min(nums)
        sumi=sum(nums)
        ts=len(nums)*mini
        return abs(ts-sumi)