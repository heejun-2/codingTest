package programmers;

public class Solution_97 {
	// 멀리 뛰기
	public long solution(int n) {
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++) {
        	dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }

}