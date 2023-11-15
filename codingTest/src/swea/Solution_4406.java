package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			String s = br.readLine();
			
			s = s.replaceAll("[aeiou]", "");
			
			sb.append("#"+tc+" "+s).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
