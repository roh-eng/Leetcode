class Solution {
    public int smallestNumber(int n, int t) {

        while (true) {

            int x = n;
            int product = 1;

            while (x > 0) {
                int last = x % 10;
                product *= last;
                x /= 10;
            }

            if (product % t == 0) {
                return n;
            }

            n++;
        }
    }
}