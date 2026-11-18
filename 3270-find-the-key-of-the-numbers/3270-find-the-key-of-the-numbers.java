class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int key = 0;
        int[] places = {1000, 100, 10, 1};

        for (int p : places) {
            int d1 = (num1 / p) % 10;   
            int d2 = (num2 / p) % 10;
            int d3 = (num3 / p) % 10;
            
            int minDigit = Math.min(d1, Math.min(d2, d3));
            key = key * 10 + minDigit;
        }

        return key;
    }
}