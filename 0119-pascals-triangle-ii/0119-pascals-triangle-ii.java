class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); 
        long ans = 1;
        for(int i = 1; i <= rowIndex; i++) {
            ans = ans * (rowIndex - i + 1);
            ans = ans / i;
            arr.add((int)ans);
        }
        return arr;
    }
}