class Solution {
    public int rob(int[] nums) {
	 //dp[i][0] is max value we can get if we dont rub i.
	 
         int[][] dp = new int[num.length + 1][2];
	 for(int i=1;i<=num.length;i++){
	 dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
	 dp[i][1] = num[i-1] + dp[i-1][0];	
       	}
	return Math.max(dp[num.length][0], dp[num.length][1]);
    }
}
