class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length == 0){
            return;
        }
        int n = matrix.length;
        int layer = (n+1)/2;
        for(int j = 1;j<=layer;j++){
            for(int i=j;i<=n-j;i++){
                //swap:
                int temp = matrix[n-i][j-1];
        matrix[n-i][j-1] = matrix[n-j][n-i];
        matrix[n-j][n-i] = matrix[i-1][n-j];
        matrix[i-1][n-j] = matrix[j-1][i-1];
        matrix[j-1][i-1] = temp;
            }
        }
    }
}