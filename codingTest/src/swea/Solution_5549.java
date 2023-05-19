package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5549 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			
			int N = s.charAt(s.length() - 1) - '0';
			
			sb.append("#"+tc+" ");
			if(N % 2 == 0) {
				sb.append("Even");
			}else {
				sb.append("Odd");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
