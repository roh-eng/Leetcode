class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            int maxDigit = 0;
            int num = nums[i];
            
            while (num > 0) {
                int digit = num % 10;
                maxDigit = Math.max(maxDigit, digit);
                num = num / 10;
            }
            
            int encrypted = 0;
            num = nums[i];
            int digitCount = 0;
            
            int temp = nums[i];
            while (temp > 0) {
                digitCount++;
                temp = temp / 10;
            }
            
            for (int j = 0; j < digitCount; j++) {
                encrypted = encrypted * 10 + maxDigit;
            }
            
            sum = sum + encrypted;
        }
        
        return sum;
    }
}