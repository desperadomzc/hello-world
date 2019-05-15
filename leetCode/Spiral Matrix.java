class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return Collections.emptyList();
        List<Integer> visited = new ArrayList<>();
        int[][] direct = {{0,1},{1,0},{0,-1},{-1,0}};
        int n = matrix.length;
        int m = matrix[0].length;
        int pointer = 0;
        int i=0,j=0;
        while(visited.size() < m*n){
            visited.add(matrix[i][j]);
            if(visited.size() == m*n) break;
            while(i+direct[pointer][0]<0||i+direct[pointer][0]>=n||
            j+direct[pointer][1]<0||j+direct[pointer][1]>=m||
            visited.contains(matrix[i+direct[pointer][0]][j+direct[pointer][1]])){
                pointer = (pointer+1)%4;
            }
            i += direct[pointer][0];
            j += direct[pointer][1];
        }
        return visited;
    }
}