package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2669 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int count = 0;
		
		int[][] arr = new int[101][101];
		
		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int a = x1; a < x2; a++) {
				for(int b = y1; b < y2; b++) {
					arr[a][b] = 1;
				}
			}
		}
		
		for(int i = 0; i < 101; i++) {
			for(int j = 0; j < 101; j++) {
				if(arr[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);

		
		
		
	}

}
