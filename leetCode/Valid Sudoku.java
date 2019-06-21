class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                if (c < '1' || c > '9') return false;
                if(!map.containsKey(c)){
                    List<Integer> l = new ArrayList<>();
                    l.add(10*i+j);
                    map.put(c,l);
                }else{
                    List<Integer> list = map.get(c);
                    for(int k = 0;k<list.size();k++){
                        int position = list.get(k);
                        if(i == position/10 || j == position%10 || squareNum(10*i+j) == squareNum(position)) return false;
                    }
                    list.add(10*i+j);
                }
            }
        }
        return true;
    }
    
    public int squareNum(int num){
        int i = num/10;
        int j = num%10;
        if(i>=0 && i<=2){
            if(j>=0 && j<=2) return 1;
            else if(j>=3&&j<=5) return 2;
            else return 3;
        }else if(i>=3 && i<=5){
            if(j>=0 && j<=2) return 4;
            else if(j>=3&&j<=5) return 5;
            else return 6;
        }else{
            if(j>=0 && j<=2) return 7;
            else if(j>=3&&j<=5) return 8;
            else return 9;
        }
    }
}
