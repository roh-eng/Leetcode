class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if (isGoodNumber(i)) {
                count++;
            }
        }
        
        return count;
    }
    
    private boolean isGoodNumber(int num) {
        String numStr = String.valueOf(num);
        StringBuilder rotated = new StringBuilder();
        
        for (char c : numStr.toCharArray()) {
            if (c == '3' || c == '4' || c == '7') {
                return false; 
            }
            if (c == '0') rotated.append('0');
            if (c == '1') rotated.append('1');
            if (c == '2') rotated.append('5');
            if (c == '5') rotated.append('2');
            if (c == '6') rotated.append('9');
            if (c == '8') rotated.append('8');
            if (c == '9') rotated.append('6');
        }
        
        return !rotated.toString().equals(numStr);
    }
}