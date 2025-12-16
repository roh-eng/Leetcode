import java.util.*;
class Solution {
    public boolean isPerfectSquare(int num) {
        int sr=(int)Math.sqrt(num);
        return sr*sr==num;
    }
}