class Solution:
    def rowAndMaximumOnes(self, mat: List[List[int]]) -> List[int]:
        
        
        maxcount=0
        bestind=0
        for i in range(len(mat)):
            count=0
            for j in range(len(mat[i])):
                if mat[i][j]==1:
                    count+=1
            if count>maxcount:
                maxcount=count
                bestind=i
        return [bestind, maxcount]
