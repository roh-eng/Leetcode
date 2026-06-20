class Solution:
    def findTheArrayConcVal(self, nums: List[int]) -> int:
        ans = 0
        left = 0
        right = len(nums) - 1

        while left < right:
            x = str(nums[left]) + str(nums[right])
            ans += int(x)
            left += 1
            right -= 1

        if left == right:
            ans += nums[left]

        return ans