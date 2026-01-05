class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if len(s) != len(goal):
            return False
        
        s1 = list(s)
        
        for i in range(len(s1)):
            
            s1.insert(0, s1.pop())
            
            if ''.join(s1) == goal:
                return True
        
        return False