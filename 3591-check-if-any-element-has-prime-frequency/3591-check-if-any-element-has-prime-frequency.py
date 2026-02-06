from collections import Counter
from typing import List

class Solution:
    def checkPrimeFrequency(self, nums: List[int]) -> bool:
        def is_prime(n):
            if n < 2:
                return False
            if n == 2:
                return True
            if n % 2 == 0:
                return False
            for i in range(3, int(n**0.5) + 1, 2):
                if n % i == 0:
                    return False
            return True
        
        freq = Counter(nums)
        
       
        for count in freq.values():
            if is_prime(count):
                return True
        
        return False