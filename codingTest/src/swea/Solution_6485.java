package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6485 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int[] arr = new int[5001];
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				for(int j = A; j <= B; j++) {
					arr[j]++;
				}
			}
			
			int P = Integer.parseInt(br.readLine());
			int[] result = new int[P];
			
			for(int i = 0; i < P; i++) {
				int tmp = Integer.parseInt(br.readLine());
				result[i] = arr[tmp];
			}
			
			
			sb.append("#"+tc+" ");
			for(int i = 0; i < P; i++) {
				sb.append(result[i]+" ");
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
