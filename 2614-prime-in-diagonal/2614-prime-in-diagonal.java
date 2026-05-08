class Solution {
    public int diagonalPrime(int[] [] nums) {
        int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {
            int val1 = nums[i] [i];
            if (isPrime(val1)) {
                if (val1 > maxPrime) {
                    maxPrime = val1;
                }
            }

             int j = n - 1 - i;
            if (i != j) { 
                int val2 = nums[i] [j];
                if (isPrime(val2)) {
                    if (val2 > maxPrime) {
                        maxPrime = val2;
                    }
                }
            }
        }

        return maxPrime;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}