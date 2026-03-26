class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        set1=set(nums1)
        set2=set(nums2)
        set3=set(nums3)

        res=set()
        for num in set1|set2|set3:
            count=(num in set1)+(num in set2)+(num in set3)
            if count>=2:
                res.add(num)
        return list(res)

        