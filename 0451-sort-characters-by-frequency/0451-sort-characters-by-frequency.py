class Solution:
    def frequencySort(self, s: str) -> str:
        freq=Counter(s)
        sorted_char=sorted(freq.keys(),key=lambda x:freq[x],reverse=True)
        re=''.join(char * freq[char] for char in sorted_char)
        return re