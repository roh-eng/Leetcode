class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1) return 1;
        
        ArrayList<Integer> ug = new ArrayList<>();
        ug.add(1);
        
        int i2 = 0, i3 = 0, i5 = 0;
        
        while (ug.size() < n) {
            int next2 = ug.get(i2) * 2;
            int next3 = ug.get(i3) * 3;
            int next5 = ug.get(i5) * 5;
            
            int nextUgly = Math.min(next2, Math.min(next3, next5));
            ug.add(nextUgly);
            
            if (nextUgly == next2) i2++;
            if (nextUgly == next3) i3++;
            if (nextUgly == next5) i5++;
        }
        
        return ug.get(n - 1);
    }
}