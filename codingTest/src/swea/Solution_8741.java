package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8741 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String str = "";
			
			for(int i = 0; i < 3; i++) {
				String s = st.nextToken();
				
				str += s.charAt(0);
			}
			
			str = str.toUpperCase();
			
			sb.append("#"+tc+" "+str).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
