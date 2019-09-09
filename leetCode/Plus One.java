class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int x = len - 1;
        while(digits[x] == 9 && x>=1){
            digits[x] = 0;
            x--;
        }
        
        if(digits[x] != 9) digits[x]++;
        else {
            int[] newd = new int[len+1];
            newd[0] = 1;
            return newd;
        } 
        
        return digits;
    }
}