package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_9229 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[N];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int sum = 0;
			int max = 0;	
			
			for(int i = 0; i < N - 1; i++) {
				sum = 0;
				for(int j = i+1; j < N; j++) {
					sum = arr[i] + arr[j];
					if(sum <= M && sum > max) max = sum;
				}
			}
			
			sb.append("#"+tc+" ");
			if(max == 0) {
				sb.append(-1);
			}else {
				sb.append(max);
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
