class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
            if (num >= 1 && num <= 9) {
                singleSum += num;
            } else if (num >= 10 && num <= 99) {
                doubleSum += num;
            }
        }

        return singleSum > totalSum - singleSum
            || doubleSum > totalSum - doubleSum;
    }
}
