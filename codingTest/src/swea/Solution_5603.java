package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5603 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			
			int sum = 0;
			
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(br.readLine());
				sum += arr[i];
			}
			
			int avg = sum / N;
			int cnt = 0;
			
			for(int i = 0; i < N; i++) {
				cnt += Math.abs(avg - arr[i]);
			}
			
			sb.append("#"+tc+" "+(cnt / 2)).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
