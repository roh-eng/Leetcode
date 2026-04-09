class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fc = 0;
        int tc = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fc++;
            } else if (bills[i] == 10) {
                if (fc > 0) {
                    fc--;
                    tc++;
                } else {
                    return false;
                }
            } else {
                if (tc > 0 && fc > 0) {
                    tc--;
                    fc--;
                } else if (fc >= 3) {
                    fc -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}