class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        allowes_set=set(allowed)
        count=0
        for word in words:
            if set(word).issubset(allowes_set):
                count+=1
        return count