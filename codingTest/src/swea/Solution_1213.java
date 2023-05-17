package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1213 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			String s = br.readLine();
			
			String str = br.readLine();
			
			int cnt = 0;
			
			for(int i = 0; i < str.length() - s.length() + 1; i++) {
				String ss = str.substring(i , i+s.length());
				if(s.equals(ss)) {
					cnt++;
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
