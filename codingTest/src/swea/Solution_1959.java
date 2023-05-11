package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1959 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int[] arrA = new int[A];
			int[] arrB = new int[B];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < A; i++) {
				arrA[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < B; i++) {
				arrB[i] = Integer.parseInt(st.nextToken());
			}
			
			int sum = 0;
			int max = 0;
			
			if(A < B) {
				for(int i = 0; i < B - A + 1; i++) {
					sum = 0;
					for(int j = 0; j < A; j++) {
						sum += arrA[j] * arrB[j+i];
					}
					if(sum > max) max = sum;
				}
			}
			else {
				for(int i = 0; i < A - B + 1; i++) {
					sum = 0;
					for(int j = 0; j < B; j++) {
						sum += arrB[j] * arrA[j+i];
					}
					if(sum > max) max = sum;
				}
			}
			
			sb.append("#"+tc+" "+max).append("\n");
			
		}
		
		System.out.println(sb.toString());
		
	}

}
