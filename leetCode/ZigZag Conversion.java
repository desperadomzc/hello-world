/*
set a boolean GoingDown to change the direction.
*/
class Solution {
    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;
        
        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0;i < Math.min(s.length(),numRows); i++){
            rows.add(new StringBuilder());
        }
        
        int curRow = 0;
        boolean changeDir = false;
        for(char c:s.toCharArray()){
            rows.get(curRow).append(c);
            if(curRow == 0 || curRow == numRows-1){
                changeDir = !changeDir;
            }
            curRow += changeDir ? 1:-1;
        }
        
        StringBuilder result = new StringBuilder();
        for(StringBuilder r : rows){
            result.append(r);
        }
        return result.toString();
    }
}
