class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        large=0
        for i in range(len(sentences)):
            x=len(sentences[i].split())
            if x>large:
                large=x
        return large