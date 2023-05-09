package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2001 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[N][N];
			
			for(int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			int max = 0;
			int sum = 0;
			
			for(int j = 0; j < N - M + 1; j++) {
				for(int k = 0; k < N - M + 1; k++) {
					sum = 0;
					for(int x = 0; x < M; x++) {
						for(int y = 0; y < M; y++) {
							sum += arr[j+x][k+y];
						}
					}
					if(max < sum) max = sum;
				}
				
			}
			sb.append("#"+i+" "+max).append("\n");
		}
		
		System.out.println(sb.toString());
		

	}

}
