package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3142 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			int unicon = 0;
			int twin = 0;
			
			for(int i = 0; i <= M; i++) {
				sum = 2 * i + (M - i);
				if(sum == N) {
					twin = i;
					unicon = M - i;
					break;
				}
			}
			
			sb.append("#"+tc+" "+unicon+" "+twin).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
