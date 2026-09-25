class Solution:
    def numberOfPairs(self, nums: list[int]) -> list[int]:
        count=0
        i=0
        while i<len(nums):
            j=i+1
            found = False
            while j<len(nums):
                if(nums[i]==nums[j]):
                    del nums[j]
                    del nums[i]
                    count+=1
                    found=True
                    break
                j+=1
            if not found:
                i+=1
        return [count,len(nums)]