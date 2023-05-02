package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11170 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			
			for(int j = N; j <= M; j++) {
				int tmp = j;
				
				if(tmp == 0) {
					cnt++;
					continue;
				}
				
				while(tmp != 0) {
					if(tmp % 10 == 0) {
						cnt++;
					}
					tmp /= 10;
				}
			}
			
			sb.append(cnt).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
