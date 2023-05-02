package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1018 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		int sol = Integer.MAX_VALUE;
		for(int i = 0; i < N - 7; i++) {
			for(int j = 0; j < M - 7; j++) {
				int curSol = getSolution(i, j , arr);
				
				if(sol > curSol) {
					sol = curSol;
				}
			}
		}
		
		System.out.println(sol);

	}
	
	public static int getSolution(int startRow, int startCol, String[] arr) {
		String[] orgArr = {"WBWBWBWB", "BWBWBWBW"};
		int whiteSol = 0;
		for(int i = 0; i < 8; i++) {
			int row = startRow + i;
			for(int j = 0; j < 8; j++) {
				int col = startCol + j;
				if(arr[row].charAt(col) != orgArr[i % 2].charAt(j)) {
					whiteSol++;
				}
			}
		}
		return Math.min(whiteSol, 64 - whiteSol);
	}

}
