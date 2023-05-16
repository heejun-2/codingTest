package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1289 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			
			int cnt = 0;
			
			if(s.charAt(0) == '1') {
				cnt++;
			}
			
			for(int i = 0; i < s.length() - 1; i++) {
				if(s.charAt(i) != s.charAt(i+1)) {
					cnt++;
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
