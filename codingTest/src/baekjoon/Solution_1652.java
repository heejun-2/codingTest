package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1652 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		char[][] arr = new char[101][101];
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0; j < N; j++) {
				arr[i][j] = s.charAt(j);
			}
			arr[i][N] = arr[N][i] = 'X';
		}
		
		int rval = 0, cval = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N - 1; j++) {
				if(arr[i][j] == '.' && arr[i][j+1] == '.' && arr[i][j+2] == 'X') {
					rval++;
				}
				if(arr[j][i] == '.' && arr[j+1][i] == '.' && arr[j+2][i] == 'X') {
					cval++;
				}
			}
		}
		
		System.out.println(rval + " " + cval);

	}

}
