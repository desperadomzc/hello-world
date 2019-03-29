/*
Ugly solution:
Some times, string is more useful than set or array,(API is excellent).
Also, substring is of lower case!!!
Besides, string.contains(Charsequence c)... not useful some times I think.(String is extends from Charsequence).
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String l = "";
        for(int i = 0;i<s.length();i++){
            String curr = s.substring(i,i+1);
            if(l.indexOf(curr) != -1){
                max = Math.max(max,l.length());
                int index = l.indexOf(curr);
                l = l.substring(index+1,l.length());
            }
            l += curr;
        }
        return Math.max(max,l.length());
    }
}
