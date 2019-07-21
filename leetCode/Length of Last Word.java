class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null) return 0;
        String[] x  = s.split(" ");
        if(x.length == 0) return 0;
        for(char c: x[x.length-1].toCharArray()){
            if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
                return 0;
            }
        }
        return x[x.length-1].length();
    }
}