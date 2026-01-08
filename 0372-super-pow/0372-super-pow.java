class Solution {
    public int superPow(int a, int[] b) {
        int mod = 1337;
        int result = 1;
        
        for (int digit : b) {
            result = (int) ((long)pow(result, 10, mod) * pow(a, digit, mod) % mod);
        }
        
        return result;
    }
    
    private int pow(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (int) ((long)result * base % mod);
            }
            exp = exp >> 1;
            base = (int) ((long)base * base % mod);
        }
        
        return result;
    }
}