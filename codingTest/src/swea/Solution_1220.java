package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1220 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[100][100];
			
			for(int i = 0; i < 100; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int cnt = 0;
			
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					
					if(arr[i][j] == 1) {
						if(i+1 == N) break;
						
						if(arr[i+1][j] == 2) {
							cnt++;
						}
						else {
							arr[i+1][j] = 1;
						}
						
					}
					
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
