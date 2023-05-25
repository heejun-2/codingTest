package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9461 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		long[] arr = new long[101];
		
		arr[1] = arr[2] = arr[3] = 1;
		arr[4] = arr[5] = 2;
		
		for(int i = 6; i <= 100; i++) {
			arr[i] = arr[i-5] + arr[i-1];
		}
		
		for(int tc = 1; tc <= T; tc++) {
			int tmp = Integer.parseInt(br.readLine());
			sb.append(arr[tmp]).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
