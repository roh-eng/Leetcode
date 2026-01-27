class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        x=len(nums)
        nums.sort()
        c=x//2
        count=0
        for i in range(0,x,2):
            if nums[i]==nums[i+1]:
                count+=1
                
        if count==c:
            return True
        else:
            return False

