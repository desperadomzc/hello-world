
	/*
	O(n^n);
	public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        String result = "";
        for(int i = 0;i<s.length();i++){
            String l = "";
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(isParlindrome(sub) && sub.length()>l.length()){
                    l = sub;
                }
            }
            if(l.length()>result.length()) result = l;
        }
        return result;
    }
    
    public Boolean isParlindrome(String s) {
        if(s.length() == 0) return false;
        String n = "";
        for(int i = s.length()-1;i>=0;i--){
            n+=s.substring(i,i+1);
        }
        return n.equals(s);
    }
	*/
class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return "";
        int start = 0,end = 0;
        for(int i=0;i<s.length();i++){
            int odd = expandToParlindrome(s,i,i);
            int even = expandToParlindrome(s,i,i+1);
            int len = odd>even ? odd:even;
            if(len > end - start){
                start = i - (len - 1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }
    
    public int expandToParlindrome(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left -1;
    }
}