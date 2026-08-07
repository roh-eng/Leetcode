class Solution:
    def doesAliceWin(self, s: str) -> bool:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        for i in range(0,len(s)):
            if s[i] in vowels:
                return True
        return False