class Solution {
    public List<String> letterCasePermutation(String S) {
        return backtrack("",0,S,new ArrayList<>());
    }

    public List<String> backtrack(String temp, int pos, String S, List<String> res) {
        if (pos == S.length()) res.add(temp);
        else {
            char x = S.charAt(pos);
            if (x >= '0' && x <= '9') backtrack(temp + x, pos + 1, S, res);
            else {
                backtrack(temp + x, pos + 1, S, res);
                if (x >= 'a' && x <= 'z') {
                    temp += (char)(x+'A'-'a');
                    backtrack(temp,pos+1,S,res);
                }else if (x >= 'A' && x <= 'Z') {
                    temp += (char) (x + 'a' - 'A');
                    backtrack(temp, pos + 1, S, res);
                }
            }
        }
        return res;
    }
}