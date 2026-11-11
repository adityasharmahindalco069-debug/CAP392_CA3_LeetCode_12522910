class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] setnums = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                setnums[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {

                    for (int k = 0; k < cols; k++) {
                        setnums[i][k] = 0;
                    }

                    for (int k = 0; k < rows; k++) {
                        setnums[k][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = setnums[i][j];
            }
        }
    }
}
