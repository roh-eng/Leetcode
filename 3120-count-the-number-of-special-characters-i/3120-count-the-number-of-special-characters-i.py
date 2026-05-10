class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        lower_set = set()
        upper_set = set()
        count = 0
        
        for char in word:
            if char.islower():
                lower_set.add(char)
            elif char.isupper():
                upper_set.add(char)
        
        for char in lower_set:
            if char.upper() in upper_set:
                count += 1
                
        return count
        