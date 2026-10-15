class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        count=0
        res=set()
        for i in range(len(words)):
            reverse_word=words[i][::-1]
            if reverse_word in res:
                count+=1
            else:
                res.add(words[i])
        return count
