package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10200 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int max = 0;
			int min = 0;
			
			if(A + B > N) {
				max = Math.min(A, B);
				min = (A + B) - N;
			}else {
				max = Math.min(A, B);
				min = 0;
			}
			
			sb.append("#"+tc+" "+max+" "+min).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
