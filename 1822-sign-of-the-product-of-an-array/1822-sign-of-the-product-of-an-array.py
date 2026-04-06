class Solution:
    def arraySign(self, nums: List[int]) -> int:
        pro=1
        for i in range(len(nums)):
            pro=pro*nums[i]

        if pro==0:
            return 0
        elif pro<0:
            return -1
        else:
            return 1