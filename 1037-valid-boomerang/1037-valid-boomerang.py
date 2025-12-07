class Solution:
    def isBoomerang(self, points: List[List[int]]) -> bool:
        (x1, y1), (x2, y2), (x3, y3) = points
        
        if points[0] == points[1] or points[1] == points[2] or points[0] == points[2]:
            return False
        
        return (x2 - x1) * (y3 - y1) != (y2 - y1) * (x3 - x1)
        