package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2805 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				String s = br.readLine();
				for(int j = 0; j < N; j++) {
					arr[i][j] = s.charAt(j)-'0';
				}
			}
			
			int sum = 0;
			
			for(int i = 0; i < N / 2; i++) {
				for(int j = N / 2 - i; j < N / 2 + i + 1; j++) {
					sum += arr[i][j];
				}
			}
			
			for(int i = N / 2; i < N; i++) {
				for(int j = i - N / 2; j < N + N / 2 - i; j++) {
					sum += arr[i][j];
				}
			}
			
			sb.append("#"+tc+" "+sum).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
