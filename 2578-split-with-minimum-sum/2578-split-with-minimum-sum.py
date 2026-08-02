class Solution:
    def splitNum(self, num: int) -> int:
        x=list(str(num))
        x.sort()
        nums1=[]
        nums2=[]
        for i in range(0,len(x),2):
            nums1.append(x[i])
            
        for j in range(1,len(x),2):
            nums2.append(x[j])
        
        n1 = int("".join(nums1)) if nums1 else 0
        n2 = int("".join(nums2)) if nums2 else 0

        return n1+n2
