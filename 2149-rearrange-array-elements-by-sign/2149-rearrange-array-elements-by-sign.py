class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [0] * n
        posindex = 0
        negindex = 1

        for i in range(n):
            if nums[i] < 0:
                res[negindex] = nums[i]
                negindex += 2
            else:
                res[posindex] = nums[i]
                posindex += 2

        return res
