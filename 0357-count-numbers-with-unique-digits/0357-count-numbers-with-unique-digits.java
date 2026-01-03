class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n > 10) n = 10; // Can't have more than 10 unique digits
        
        int count = 1; 
        int choices = 9;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                count += 9;
            } else {
                choices *= (11 - i); 
                count += choices;
            }
        }
        
        return count;
    }
}