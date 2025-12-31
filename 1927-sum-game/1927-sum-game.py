class Solution:
    def sumGame(self, num: str) -> bool:
        n = len(num)
        mid = n // 2
        
        left_sum = 0
        left_questions = 0
        for i in range(mid):
            if num[i] == '?':
                left_questions += 1
            else:
                left_sum += int(num[i])
        
        right_sum = 0
        right_questions = 0
        for i in range(mid, n):
            if num[i] == '?':
                right_questions += 1
            else:
                right_sum += int(num[i])
        
        sum_diff = left_sum - right_sum
        question_diff = left_questions - right_questions
        
        return sum_diff + question_diff * 4.5 != 0