class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        c1 = Counter(nums1)
        res = []
        
        for num in nums2:
            if c1[num] > 0:
                res.append(num)
                c1[num] -= 1
                
        return res