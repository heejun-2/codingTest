package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8104 {

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
			int[] arr = new int[K];
			
			int cnt = 1;
			
			for(int i = 1; i <= N; i++) {
				if(i % 2 == 1) {
					for(int j = 0; j < K; j++) {
						arr[j] += cnt;
						cnt++;
					}
				}
				else {
					for(int j = K - 1; j >= 0; j--) {
						arr[j] += cnt;
						cnt++;
					}
				}
			}
			
			sb.append("#"+tc+" ");
			for(int i = 0; i < K; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
