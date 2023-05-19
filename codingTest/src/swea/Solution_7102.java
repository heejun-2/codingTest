package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7102 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[N+M+1];
			
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= M; j++) {
					int sum = i + j;
					arr[sum]++;
				}
			}
			
			int max = Integer.MIN_VALUE;
			
			for(int i = 2; i < arr.length; i++) {
				max = Math.max(max, arr[i]);
			}
			
			sb.append("#"+tc+" ");
			for(int i = 2; i < arr.length; i++) {
				if(arr[i] == max) {
					sb.append(i+" ");
				}
			}
			sb.append("\n");
			
			
		}
		
		System.out.println(sb.toString());

	}

}
