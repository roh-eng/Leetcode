import java.util.*;

class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; Math.pow(x, i) < bound; i++) {

            for (int j = 0; Math.pow(y, j) < bound; j++) {

                int val = (int)(Math.pow(x, i) + Math.pow(y, j));

                if (val <= bound) {
                    hs.add(val); }

                if (y == 1) break; 
            }

            if (x == 1) break; 
        }

        return new ArrayList<>(hs);
    }
}