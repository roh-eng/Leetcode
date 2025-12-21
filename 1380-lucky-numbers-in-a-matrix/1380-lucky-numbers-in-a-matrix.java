class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
List<Integer> rowMin = new ArrayList<>();
for (int i = 0; i < matrix.length; i++) {
    int min = matrix[i][0];
    for (int j = 1; j < matrix[i].length; j++) {
        if (matrix[i][j] < min) min = matrix[i][j];
    }
    rowMin.add(min);
}
List<Integer> colMax = new ArrayList<>();
for (int j = 0; j < matrix[0].length; j++) {
    int max = matrix[0][j];
    for (int i = 1; i < matrix.length; i++) {
        if (matrix[i][j] > max) max = matrix[i][j];
    }
    colMax.add(max);
}
List<Integer> result = new ArrayList<>();
for (int num : rowMin) {
    if (colMax.contains(num)) {
        result.add(num);
    }
}
return result;
    }
}