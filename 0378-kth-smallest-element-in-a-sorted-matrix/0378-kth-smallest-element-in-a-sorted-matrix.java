class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix.length;
        int[] arr = new int[rows * cols];
        int index = 0;
        for(int i = 0; i < rows; i++) {
        for(int j = 0; j < cols; j++) {
            arr[index++] = matrix[i][j];
            
        }
    }
        Arrays.sort(arr);
        return arr[k - 1];      
}
}