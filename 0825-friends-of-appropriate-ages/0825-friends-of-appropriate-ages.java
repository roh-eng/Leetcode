class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];

        for (int age : ages) {
            count[age]++;
        }

        int requests = 0;

        for (int ageX = 1; ageX <= 120; ageX++) {
            for (int ageY = 1; ageY <= 120; ageY++) {

                if (count[ageX] == 0 || count[ageY] == 0) continue;

                if (ageY <= 0.5 * ageX + 7) continue;
                if (ageY > ageX) continue;
                if (ageY > 100 && ageX < 100) continue;

                requests += count[ageX] * count[ageY];

                if (ageX == ageY) {
                    requests -= count[ageX]; 
                }
            }
        }

        return requests;
    }
}