package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1259 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String s = br.readLine();
			if(s.equals("0")) break;
			
			boolean isPass = true;
			
			for(int i = 0; i < s.length()/2; i++) {
				if(s.charAt(i) != s.charAt(s.length()-i-1)) {
					isPass = false;
					break;
				}
			}
			
			if(isPass) {
				sb.append("yes").append("\n");
			}else {
				sb.append("no").append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}

}
