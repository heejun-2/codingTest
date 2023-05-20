package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_9700 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			double p = Double.parseDouble(st.nextToken());
			double q = Double.parseDouble(st.nextToken());
			
			double s1 = (1 - p) * q;
			double s2 = p * (1 - q) * q;
			
			sb.append("#"+tc+" ");
			if(s1 < s2) {
				sb.append("YES");
			}else {
				sb.append("NO");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
