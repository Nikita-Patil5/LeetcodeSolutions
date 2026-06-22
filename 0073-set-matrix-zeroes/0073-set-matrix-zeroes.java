class Solution {
    public void setZeroes(int[][] matrix) {
        int n_rows = matrix.length;
        int n_cols = matrix[0].length;

        boolean [] rows = new boolean[n_rows];
        boolean [] cols = new boolean[n_cols];

        for(int i = 0; i < n_rows; i++){
            for(int j = 0;  j < n_cols; j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for(int i = 0; i < n_rows; i++){
            for(int j = 0; j < n_cols; j++){
                if(rows[i] || cols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}