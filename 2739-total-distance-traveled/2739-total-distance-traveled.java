import java.util.*;
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        
        int k = Math.min(additionalTank, ((mainTank - 1) / 4));
        int  d = 10 * (mainTank + k);
        return d;
    }
}