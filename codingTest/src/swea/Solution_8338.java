package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8338 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int sum = 0;
			
			sum += arr[0];
			
			for(int i = 1; i < N; i++) {
				sum = Math.max(sum + arr[i], sum * arr[i]);
			}
			
			sb.append("#"+tc+" "+sum).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
