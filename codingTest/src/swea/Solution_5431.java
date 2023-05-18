package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5431 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[N+1];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < K; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				arr[tmp]++;
			}
			
			sb.append("#"+tc+" ");
			for(int i = 1; i <= N; i++) {
				if(arr[i] == 0) {
					sb.append(i+" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
