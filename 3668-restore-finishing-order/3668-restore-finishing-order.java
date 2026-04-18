import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> friendSet = new HashSet<>();
        for (int f : friends) {
            friendSet.add(f);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < order.length; i++) {
            if (friendSet.contains(order[i])) {
                res.add(order[i]);
            }
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}