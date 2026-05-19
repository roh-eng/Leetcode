class Solution {
    public int minOperations(int n) {
        int op = 0;
        
        for (int i = 0; i < n / 2; i++) {
            int currentValue = (2 * i) + 1;
            
            op += (n - currentValue);
        }
        
        return op;
    }
}