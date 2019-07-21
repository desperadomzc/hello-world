class Solution {
    public int minPathSum(int[][] grid) {
        if(grid == null) return 0;
        int m = grid[0].length;
        int n = grid.length;
        //init:
        if(m>1){
            for (int a = 1; a < m; a++) {
                grid[0][a] += grid[0][a - 1];
            }
        }
        if(n>1){
            for (int b = 1; b < n; b++) {
                grid[b][0] += grid[b - 1][0];
            }
        }

        //dynamic:
        if(m>1 && n>1){
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    grid[i][j] += Math.min(grid[i][j - 1], grid[i - 1][j]);
                }
            }
        }
        
        return grid[n - 1][m - 1];
    }
}
