class Solution {
    public boolean checkPowersOfThree(int n) {
        String s=Integer.toString(n,3);
        if(s.contains("2")){
            return false;
        }
        return true;
    }
}