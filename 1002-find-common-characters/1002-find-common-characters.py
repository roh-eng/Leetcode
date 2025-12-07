from collections import Counter
class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        cnt=Counter(words[0])
        for w in words:
            cc=Counter(w)
            for c in cnt:
                cnt[c]=min(cnt[c],cc[c])
        res=[]
        for c in cnt:
            for i in range(cnt[c]):
                res.append(c)
        return res