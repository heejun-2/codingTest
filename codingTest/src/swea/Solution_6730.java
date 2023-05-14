package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6730 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			int maxUp = 0;
			int maxDown = 0;
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i < N - 1; i++) {
				int A = arr[i+1] - arr[i];
				if(A > 0) {
					if(A > maxUp) {
						maxUp = A;
					}
				}
				if(A < 0) {
					if(A < -maxDown) {
						maxDown = -A;
					}
				}
			}
			
			sb.append("#"+tc+" "+maxUp+" "+maxDown).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
