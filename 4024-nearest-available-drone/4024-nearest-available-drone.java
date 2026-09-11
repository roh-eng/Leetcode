class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int m = Integer.MAX_VALUE;
        int ans = -1;

        for (int i = 0; i < drones.length; i++) {
            int dist = Math.abs(target[0] - drones[i][0])
                     + Math.abs(target[1] - drones[i][1]);

            if (dist <= drones[i][2] && dist < m) {
                m = dist;
                ans = i;
            }
        }
        return ans;
    }
}   