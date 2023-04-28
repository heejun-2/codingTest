package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			String s = br.readLine();
			int tmp = 0;
			
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '(') {
					tmp++;
				}
				else if(s.charAt(j) == ')') {
					tmp--;
					if(tmp < 0) {
						break;
					}
				}
			}
			
			if(tmp == 0) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}

}
