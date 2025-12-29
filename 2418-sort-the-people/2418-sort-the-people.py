class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        dct = {h: k for k, h in zip(names, heights)}
        dct = dict(sorted(dct.items(), key=lambda x: x[0], reverse=True))
        return list(dct.values())