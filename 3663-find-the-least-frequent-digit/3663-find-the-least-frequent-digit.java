class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer, Integer> f = new HashMap<>();
        String str = String.valueOf(n);
        
        
        for (char c : str.toCharArray()) {
            int d = Character.getNumericValue(c);
            f.put(d, f.getOrDefault(d, 0) + 1);  
        }
        
        
        int minDigit = -1;
        int minFreq = Integer.MAX_VALUE;
        
        for (int digit : f.keySet()) {  
            if (f.get(digit) < minFreq) {  
                minFreq = f.get(digit);
                minDigit = digit;
            }
        }
        
        return minDigit;
    }
}