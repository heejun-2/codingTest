package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_14501 {

	static int N;
	static int[][] schedule;
	static int result;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		schedule = new int[N][2];
		
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			schedule[i][0] = Integer.parseInt(st.nextToken());
			schedule[i][1] = Integer.parseInt(st.nextToken());
		}
		
		result = 0;
		
		dfs(0, 0);

		System.out.println(result);
	}
	
	static void dfs(int idx, int pay) {
		if(idx >= N) {
			result = Math.max(pay, result);
			return;
		}
		
		if(idx + schedule[idx][0] <= N) {
			dfs(idx + schedule[idx][0], pay + schedule[idx][1]);
		}else {
			dfs(idx + schedule[idx][0], pay);
		}
		
		dfs(idx + 1, pay);
	}

}
