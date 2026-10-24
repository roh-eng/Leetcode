class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] totaldays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum1 = 0;
        for (int i = 0; i < Integer.parseInt(arriveAlice.substring(0, 2))-1; i++) {
            sum1 += totaldays[i];
        }
        int aStart = sum1 + Integer.parseInt(arriveAlice.substring(3, 5));

        int sum2 = 0;
        for (int i = 0; i < Integer.parseInt(leaveAlice.substring(0, 2))-1; i++) {
            sum2 += totaldays[i];
        }
        int aEnd = sum2 + Integer.parseInt(leaveAlice.substring(3, 5));

        int sum3 = 0;
        for (int i = 0; i < Integer.parseInt(arriveBob.substring(0, 2))-1; i++) {
            sum3 += totaldays[i];
        }
        int bStart = sum3 + Integer.parseInt(arriveBob.substring(3, 5));

        int sum4 = 0;
        for (int i = 0; i < Integer.parseInt(leaveBob.substring(0, 2))-1; i++) {
            sum4 += totaldays[i];
        }
        int bEnd = sum4 + Integer.parseInt(leaveBob.substring(3, 5));   
        int lo = Math.max(aStart, bStart);
        int hi = Math.min(aEnd, bEnd);

        return lo > hi ? 0 : hi - lo + 1;   
    }
}