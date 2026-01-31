class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        l=len(arr)
        ans=int(l*0.25)
        freq = {}
        for num in arr:
            freq[num] = freq.get(num, 0) + 1
            if freq[num] > ans:
                return num

            


