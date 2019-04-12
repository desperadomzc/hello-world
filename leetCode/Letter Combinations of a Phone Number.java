class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return Collections.emptyList();
        List<String> list = new ArrayList<>();
        backtrack(digits,list,0,new StringBuilder());
        return list;
    }

    public void backtrack(String digits,List<String> list,int index,StringBuilder s) {
        if(index == digits.length()){
            list.add(new String(s));
        }else{
            int num = digits.charAt(index) - '2';
            int len = 3;
            if(num==5) {
                len = 4;
                num = 15;
            }else if (num==7){
                len = 4;
                num = 22;
            }else if(num==6){
                len = 3;
                num = 19;
            }else{
                num = num*3;
            }
            for(int i = num;i<num+len;i++){
                s.append((char)(i+97));
                backtrack(digits,list,index+1,s);
                s.deleteCharAt(s.length()-1);
            }
        }
    }
}
