package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2817 {
	// 부분 수열의 합
	static int N, K, cnt;
	static int[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			arr = new int[N];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			cnt = 0;
			
			solve(0, 0);
			
			sb.append("#"+tc+" "+cnt).append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	static void solve(int idx, int sum) {
		if(sum == K) {
			cnt++;
			return;
		}
		else if(sum > K || idx == N) {
			return;
		}
		
		solve(idx + 1, sum);
		solve(idx + 1, sum + arr[idx]);
	}

}
