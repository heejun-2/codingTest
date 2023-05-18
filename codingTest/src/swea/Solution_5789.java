package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5789 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[N+1];
			
			for(int i = 1; i <= Q; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int L = Integer.parseInt(st.nextToken());
				int R = Integer.parseInt(st.nextToken());
				
				for(int j = L; j <= R; j++) {
					arr[j] = i;
				}
			}
			
			sb.append("#"+tc+" ");
			for(int i = 1; i <= N; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
