package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_9613 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			long sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[N];
			for(int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			for(int j = 0; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					sum += gcd(arr[j], arr[k]);
				}
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int tmp = a % b;
			
			a = b;
			b = tmp;
		}
		return a;
	}

}
