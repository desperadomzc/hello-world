class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int x = 0, y = 0;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int dir = 0;

        for (int i = 1; i <= n * n; i++) {
            mat[x][y] = i;
            if (x + dirs[dir][0] >= n
                    || x + dirs[dir][0] < 0
                    || y + dirs[dir][1] >= n
                    || y + dirs[dir][1] < 0
                    || mat[x + dirs[dir][0]][y + dirs[dir][1]] != 0) dir = changeDir(dir);
            x += dirs[dir][0];
            y += dirs[dir][1];
        }

        return mat;
    }

    public int changeDir(int pre) {
        if (pre == 3) return 0;
        else return pre + 1;
    }

}