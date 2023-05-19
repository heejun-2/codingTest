package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_13547 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			
			int win = 15 - s.length();
			
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'o') {
					win++;
				}
			}
			
			sb.append("#"+tc+" ");
			if(win >= 8) {
				sb.append("YES");
			}else {
				sb.append("NO");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
