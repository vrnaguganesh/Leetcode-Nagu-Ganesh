// Last updated: 8/12/2026, 9:32:05 PM
class Solution {
    public int numSquares(int n) {
         int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1); // Fill with max possible value
        dp[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        
        return dp[n];
        
    }
}