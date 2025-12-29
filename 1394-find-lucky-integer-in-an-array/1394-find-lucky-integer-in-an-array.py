class Solution:
    def findLucky(self, arr: List[int]) -> int:
        freq={}
        for i in arr:
            freq[i]=freq.get(i,0)+1
        lucky=[]
        for num,count in freq.items():
            if num==count:
                lucky.append(num)
        return max(lucky) if lucky else -1
        