class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        
        // Check if the first row and column have zeros
        boolean isRow0 = false, isCol0 = false;
        for (int j = 0; j < colLen; j++) {
            if (matrix[0][j] == 0) isRow0 = true;
        }
        for (int i = 0; i < rowLen; i++) {
            if (matrix[i][0] == 0) isCol0 = true;
        }
        
        // Mark the elements to be set to zero
        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        // Set the remaining elements to zero based on the marking
        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
        }
        
        // Set the first row and column to zero if needed
        if (isRow0) {
            for (int j = 0; j < colLen; j++) matrix[0][j] = 0;
        }
        if (isCol0) {
            for (int i = 0; i < rowLen; i++) matrix[i][0] = 0;
        }
    }
}