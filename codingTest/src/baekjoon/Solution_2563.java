package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2563 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[101][101];
		
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int left = Integer.parseInt(st.nextToken());
			int down = Integer.parseInt(st.nextToken());
			
			for(int j = left; j < left + 10; j++) {
				for(int k = down; k < down + 10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i][j] == 1) cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
