import collections
from typing import List

class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count = collections.Counter(arr)
        values = count.values()
        return len(values) == len(set(values))
