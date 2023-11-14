package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8457 {
	// 알 덴테 스파게티
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			int cnt = 0;
			for(int i = 0; i < N; i++) {
				int x = Integer.parseInt(st.nextToken());
				
				for(int j = B - E; j <= B + E; j++) {
					if(j % x == 0) {
						cnt++;
						break;
					}
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
			
		}
		
		System.out.println(sb.toString());
	}

}
