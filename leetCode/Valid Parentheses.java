class Solution {
    public static boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        Stack para = new Stack<Character>();
        for(char c:s.toCharArray()){
            char n = ' ';
            if(!para.isEmpty()){
                n = (Character) para.peek();
                if((n == '(' && c == ')')||(n == '['&&c == ']')||(n == '{'&&c == '}')){
                    para.pop();
                }else{
                    para.push(c);
                }
            }else{
                para.push(c);
            }
        }
        return para.isEmpty();
    }
}
