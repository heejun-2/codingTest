package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_7510 {
	// 상원이의 연속 합
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int sum = 0;
			int cnt = 0;
			if(N != 1) {
				cnt = 1;
			}
			
			for(int i = 1; i <= N / 2 + 1; i++) {
				sum = 0;
				for(int j = i; j <= N / 2 + 1; j++) {
					sum += j;
					if(sum == N) cnt++;
					if(sum >= N) break;
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
