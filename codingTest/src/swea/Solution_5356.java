package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5356 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			String[] s = new String[5];
			
			int max = 0;
			
			for(int i = 0; i < 5; i++) {
				s[i] = br.readLine();
				if(s[i].length() > max) max = s[i].length();
			}
			
			sb.append("#"+tc+" ");
			for(int i = 0; i < max; i++) {
				for(int j = 0; j < 5; j++) {
					if(s[j].length() <= i) {
						continue;
					}
					else {
						sb.append(s[j].charAt(i));
					}
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
