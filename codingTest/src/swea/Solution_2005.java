package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2005 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[N][N];
			
			for(int j = 0; j < N; j++) {
				for(int k = 0; k <= j; k++) {
					if(j == k || k == 0) {
						arr[j][k] = 1;
					}
					else {
						arr[j][k] = arr[j-1][k-1] + arr[j-1][k];
					}
				}
			}
			
			sb.append("#"+i).append("\n");
			for(int j = 0; j < N; j++) {
				for(int k = 0; k <= j; k++) {
					sb.append(arr[j][k]).append(" ");
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());

	}

}
