class Solution {
    public int totalMoney(int n) {
        int fullWeeks = n / 7;
        int remainingDays = n % 7;
        int sum = 0;
        
        for (int week = 0; week < fullWeeks; week++) {
            sum += 28 + 7 * week;
        }
        
        int startDay = fullWeeks + 1;
        for (int day = 0; day < remainingDays; day++) {
            sum += startDay + day;
        }
        
        return sum;
    }
}