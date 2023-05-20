package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5642 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			int[] dp = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			dp[0] = arr[0];
			int max = arr[0];
			
			for(int i = 1; i < N; i++) {
				dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
				max = Math.max(max, dp[i]);
			}
			
			sb.append("#"+tc+" "+max).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
