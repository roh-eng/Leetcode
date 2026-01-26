class Solution:
    def percentageLetter(self, s, letter):
        count = s.count(letter)
        return int((count / len(s)) * 100)