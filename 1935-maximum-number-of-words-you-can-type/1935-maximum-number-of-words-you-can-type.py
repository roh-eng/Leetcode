class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        words=text.split()
        valid_count=0
        for word in words:
            is_broken=False
            for char in word:
                if char in brokenLetters:
                    is_broken=t=True
                    break
            if not is_broken:
                valid_count+=1
        return valid_count