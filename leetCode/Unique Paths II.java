class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        int index = -1;
        for(int k=0;k<m;k++){
            if(obstacleGrid[k][0] == 1){
                index = k;
                break;
            }
            dp[k][0] = 1;
        }
        if(index!=-1){
            for(int t = index;t<m;t++){
                dp[t][0] = 0;
            }
        }
        int newin = -1;
        for(int k=0;k<n;k++){
            if(obstacleGrid[0][k] == 1){
                newin = k;
                break;
            }
            dp[0][k] = 1;
        }
        if(newin!=-1){
            for(int t=newin;t<n;t++){
                dp[0][t] = 0;
            }
        }
        if(m==1) return dp[0][n-1];
        if(n==1) return dp[m-1][0];

        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
/*
Clearer colution
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1) return 0;
        
        obstacleGrid[0][0] = obstacleGrid[0][0] == 1? 0:1;

        for (int i = 1; i < m; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }

        for (int i = 1; i < n; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                obstacleGrid[i][j] = obstacleGrid[i][j] == 1 ? 0 : obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
        }
    }
        return obstacleGrid[m-1][n-1];
}
}
*/
