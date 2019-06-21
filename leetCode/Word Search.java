class Solution {
    public boolean exist(char[][] board, String word) {
        boolean ok = false;
        char c = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == c) {
//                    System.out.println(i+","+j);
                    if(backtrack(i, j, word, word.length(), board)) ok = true;
                }
            }
        }
        return ok;
    }

    public boolean backtrack(int startx, int starty, String word, int count, char[][] board) {
        if (startx >= board.length || startx < 0 || starty >= board[0].length || starty < 0 || board[startx][starty] != word.charAt(word.length() - count))
            return false;
        if (count == 1) {
            return true;
        } else {
            char temp = board[startx][starty];
            board[startx][starty] = '0';
            if (backtrack(startx + 1, starty, word, count - 1, board)
                    || backtrack(startx - 1, starty, word, count - 1, board)
                    || backtrack(startx, starty + 1, word, count - 1, board)
                    || backtrack(startx, starty - 1, word, count - 1, board)) return true;
            board[startx][starty] = temp;
        }
        return false;
    }
}
