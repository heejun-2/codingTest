package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1989 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= T; i++) {
			String s = br.readLine();
			
			boolean pass = true;
			
			for(int j = 0; j < s.length() / 2; j++) {
				if(s.charAt(j) != s.charAt(s.length() - j - 1)) {
					pass = false;
					break;
				}
			}
			
			if(pass) {
				sb.append("#"+i+" "+1).append("\n");
			}else {
				sb.append("#"+i+" "+0).append("\n");
			}
			
		}
		
		System.out.println(sb.toString());

	}

}
