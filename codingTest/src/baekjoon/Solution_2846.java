package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2846 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		int max = 0;
		
		for(int i = 0; i < N-1; i++) {
			if(arr[i+1] - arr[i] > 0) {
				sum+= arr[i+1] - arr[i];
				max = Math.max(sum, max);
			}else {
				sum = 0;
			}
		}
		
		System.out.println(max);

	}

}
