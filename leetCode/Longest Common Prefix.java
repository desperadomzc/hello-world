class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int minlen = strs[0].length();
        for(String x:strs){
            minlen = Math.min(x.length(),minlen);
        }
        if(minlen == 0) return "";
        int pointer = 0;
        boolean stop = false;
        while(pointer<minlen){
            char c = strs[0].charAt(pointer);
            for(String s : strs){
                if(s.charAt(pointer) != c){
                    stop = true;
                }
            }
            if(!stop) pointer++;
            else break;
        }
        return strs[0].substring(0,pointer);
    }
}
