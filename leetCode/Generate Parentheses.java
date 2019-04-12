class Solution {
    public List<String> generateParenthesis(int n) {
        if(n == 0) return Collections.emptyList();
        List<String> list = new ArrayList<>();
        backtrack(n,n,new StringBuilder(),list);
        return list;
    }

    public void backtrack(int remainL,int remainR, StringBuilder s,List<String> list){
        if(remainL > remainR){
            return;
        }
        if(remainL==0 && remainR == 0){
            list.add(new String(s));
        }else{
            if(remainL>0){
                s.append('(');
                backtrack(remainL-1,remainR,s,list);
                s.deleteCharAt(s.length()-1);
            }
            if(remainR>0){
                s.append(')');
                backtrack(remainL,remainR-1,s,list);
                s.deleteCharAt(s.length()-1);
            }
            
        }
    }
}
