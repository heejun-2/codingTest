package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1236 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[N][M];
		
		int row = 0;
		int col = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		for(int i = 0 ; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] == 'X') {
					row++;
					break;
				}
			}
		}
		
		row = N - row;
		
		for(int j = 0; j < M; j++) {
			for(int i = 0; i < N; i++) {
				if(arr[i][j] == 'X') {
					col++;
					break;
				}
			}
		}
		
		col = M - col;
		
		if(row > col) {
			System.out.println(row);
		}else {
			System.out.println(col);
		}

	}

}
