class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> ca = new HashSet<Integer>();
        for(int i=0;i<candyType.length;i++){
                ca.add(candyType[i]);
            
        }
        return Math.min(ca.size(),candyType.length/2);
    }
}