class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        mini = []
        for time in timePoints:
            h, m = time.split(':')
            total_min = int(h) * 60 + int(m)
            mini.append(total_min)

        mini.sort()
        min_dif = float('inf')

        for i in range(len(mini) - 1):
            diff = mini[i + 1] - mini[i]
            min_dif = min(min_dif, diff)

        wrp = 1440 - (mini[-1] - mini[0])
        min_dif = min(min_dif, wrp)

        return min_dif