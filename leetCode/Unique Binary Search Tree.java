class Solution {
    int[] dp;
    public int numTrees(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        return helper(n);
    }

    public int helper(int n){
        if(dp[n] != 0) return dp[n];
        int sum = 0;
        for(int i  = 0; i<n ;i++){
            sum += helper(i) * helper(n - 1 - i);
        }
        dp[n] = sum;
        return sum;
    }
}
