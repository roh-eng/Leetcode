class Solution:
    def sortByReflection(self, nums: List[int]) -> List[int]:
        temp = 0

        for i in range(len(nums)-1):
            for j in range(i+1, len(nums)):

                binary = bin(nums[i])[2:]
                rev = binary[::-1]
                number = int(rev, 2)

                binary1 = bin(nums[j])[2:]
                rev1 = binary1[::-1]
                number1 = int(rev1, 2)

                if number > number1 or (number == number1 and nums[i] > nums[j]):
                    temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp

        return nums