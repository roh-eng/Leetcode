class Solution:
    def reformat(self, s: str) -> str:

        digits=[c for c in s if c.isdigit()]
        letters=[c for c in s if c.isalpha()]
        if abs(len(digits)-len(letters))>1:
            return ""
        if len(digits)>len(letters):
            first,second=digits,letters
        else:
            first,second=letters,digits
        result=[]
        for i in range(len(second)):
            result.append(first[i])
            result.append(second[i])
        if len(first)>len(second):
            result.append(first[-1])
        return ''.join(result)