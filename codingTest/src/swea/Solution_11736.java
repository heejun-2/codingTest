package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11736 {

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
			
			int cnt = 0;
			for(int i = 1; i < N - 1; i++) {
				if((arr[i-1] > arr[i] && arr[i] > arr[i+1])
						|| (arr[i-1] < arr[i] && arr[i] < arr[i+1])) {
					cnt++;
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
