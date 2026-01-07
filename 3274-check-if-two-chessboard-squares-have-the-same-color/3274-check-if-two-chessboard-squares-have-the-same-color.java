class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int z=coordinate1.charAt(0)+(coordinate1.charAt(1)-'0');
        int y=coordinate2.charAt(0)+(coordinate2.charAt(1)-'0');
        return z%2==y%2;

    }
}