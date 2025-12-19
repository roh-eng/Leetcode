import java.util.*;
class Solution {
    public int findClosest(int x, int y, int z) {
        int xd=Math.abs(z-x);
        int yd=Math.abs(z-y);
        if(xd<yd){
            return 1;
        }else if(xd>yd){
            return 2;
        }else{
            return 0;
        }
    }
}