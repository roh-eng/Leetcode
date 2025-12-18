class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        int[] temp = arr.clone();

        Arrays.sort(temp);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : temp) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}
