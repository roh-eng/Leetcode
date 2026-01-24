class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        letters=[char for char in s if char.isalpha()]
        letters.reverse()
        result=[]
        letter_index=0
        for char in s:
            if char.isalpha():
                result.append(letters[letter_index])
                letter_index += 1
            else:
                result.append(char)
        return ''.join(result)