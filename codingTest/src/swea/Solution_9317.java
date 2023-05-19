package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9317 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			String s = br.readLine();
			String ss = br.readLine();
			
			int cnt = 0;
			
			for(int i = 0; i < N; i++) {
				if(s.charAt(i) == ss.charAt(i)) {
					cnt++;
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
			
		}
		
		System.out.println(sb.toString());
		
	}

}
