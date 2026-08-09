class Solution:
    def findEvenNumbers(self, digits: List[int]) -> List[int]:
        res=[]
        digit_counts=Counter(digits)
        for i in range(100,1000,2):
            x=list(str(i))
            c1=Counter(x)
            can_form=True
            for digit_char,count_needed in c1.items():
                if digit_counts[int(digit_char)]<count_needed:
                    can_form=False
                    break
            else:
                res.append(i)
        return res