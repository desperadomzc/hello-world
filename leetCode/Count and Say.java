class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        return countSay(countAndSay(n - 1));
    }

    public String countSay(String x) {
        String res = "";
        for (int i = 0; i < x.length(); i++) {
            int len = 1;
            char c = x.charAt(i);
            while (i < x.length() - 1 && x.charAt(i + 1) == x.charAt(i)) {
                i++;
                len += 1;
            }
            res += len;
            res += c;
        }
        return res;
    }
}
