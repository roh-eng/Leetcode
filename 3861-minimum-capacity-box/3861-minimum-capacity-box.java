class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minCapacityFound = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize) {
                if (capacity[i] < minCapacityFound) {
                    minCapacityFound = capacity[i];
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }
}