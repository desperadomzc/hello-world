class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (divisor == -1) return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend;
        boolean isPos = !((dividend > 0) ^ (divisor > 0));
        long dd = Math.abs((long)dividend);
        long dr = Math.abs((long)divisor);
        if (dd < dr) return 0;
        int res = 0;
        while(dd >= dr){
            int count = 0;
            while(dd >= dr<<count){
                res += 1<<count;
                dd -= dr<<count;
                count ++;
            }
        }
        return isPos ? res : -res;
    }
}
//按位异或^
//位运算，节省时间！！！