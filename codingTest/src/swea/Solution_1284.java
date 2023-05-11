package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1284 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int P = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			int S = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			
			int A = P * W;
			int B = 0;
			
			if(W <= R) {
				B = Q;
			}else {
				B = Q + (W - R) * S;
			}
			
			sb.append("#"+tc+" "+Math.min(A, B)).append("\n");
			
		}
		
		System.out.println(sb.toString());
	}

}
