class Solution:
    def convertDateToBinary(self, date: str) -> str:
        binary_date = "-".join(bin(int(i))[2:] for i in date.split("-"))
        return binary_date