package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9625 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		int[][] arr = new int[2][46];
		arr[0][2] = 1;
		arr[1][1] = 1;
		arr[1][2] = 1;
		
		for(int i = 3; i <= K; i++) {
			arr[0][i] = arr[0][i-2] + arr[0][i-1];
			arr[1][i] = arr[1][i-2] + arr[1][i-1];
		}

		System.out.println(arr[0][K] + " " + arr[1][K]);
	}

}
