package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1926 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= N; i++) {
			String s = String.valueOf(i);
			int cnt = 0;
			
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
					cnt++;
				}
			}
			
			if(cnt == 0) {
				sb.append(i).append(" ");
			}else {
				for(int j = 0; j < cnt; j++) {
					sb.append("-");
				}
				sb.append(" ");
			}
		}
		
		System.out.println(sb.toString());

	}

}
