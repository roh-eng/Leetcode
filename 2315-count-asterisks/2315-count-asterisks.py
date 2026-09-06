class Solution:
    def countAsterisks(self, s: str) -> int:
        count=0
        inside_pair=False
        for i in s:
            if i=='|':
                inside_pair=not inside_pair
                
            elif i=='*':
                if not inside_pair:
                    count+=1
        return count    
            