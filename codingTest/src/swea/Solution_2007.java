package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2007 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= T; i++) {
			String s = br.readLine();
			
			for(int j = 1; j < s.length(); j++) {
				String a = s.substring(0, j);
				String b = s.substring(j, 2 * j);
				
				if(a.equals(b)) {
					sb.append("#"+i+" "+a.length()).append("\n");
					break;
				}
			}
		}
		
		System.out.println(sb.toString());
	}

}
