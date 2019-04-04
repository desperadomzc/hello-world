class Solution {
    public static int myAtoi(String str) {
        if(str.length() == 0 || str == null) return 0;
        StringBuilder s = new StringBuilder();
        int left = 0;
        int len = str.length();
        boolean isPos = true;
        //str.charAt(left) != '-' && str.charAt(left)!= '+' && !Character.isSpaceChar(str.charAt(left))
        for(;left < len;left++){
            if(str.charAt(left)-'0'>=0 && str.charAt(left)-'0'<=9 ) break;
        }
        // System.out.println(left);
        if(left>0){
            if(str.charAt( left - 1) == '-') isPos = false;
            else if(str.charAt(left - 1) != '+' && !Character.isSpaceChar(str.charAt(left - 1))) return 0;
            for(char c : str.substring(0,left-1).toCharArray()){
                if(!Character.isSpaceChar(c)) return 0;
            }
        }
        for(char r : str.substring(left).toCharArray()){
            if(r -'0'<0 || r -'0'>9) break;
            s.append(r);
        }
        if(s.length() == 0) return 0;
        if(left > 0 && str.charAt( left - 1) == '-') isPos = false;
        // System.out.println(s);
        long res = 0;
        for(int i = 0;i<s.length();i++){
            res += Math.pow(10,s.length() - i - 1)*(s.charAt(i) - '0');
        }
        res = isPos? res : -res;
        if(res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)res;
    }
}
