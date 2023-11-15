package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4789 {
	// 성공적인 공연 기획
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			
			int total = 0;
			int need = 0;
			
			for(int i = 0; i < s.length(); i++) {
				int num = s.charAt(i) - '0';
				
				if(num != 0) {
					if(total < i) {
						need += (i - total);
						total = i;
					}
				}
				total += num;
			}
			
			sb.append("#"+tc+" "+need).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
