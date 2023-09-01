package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_13301 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long sum = 0;
		long[] arr = new long[N+1];
		
		arr[1] = 1;
		
		if(N != 1) {
			arr[2] = 1;
			
			for(int i = 3; i < arr.length; i++) {
				arr[i] = arr[i - 2] + arr[i - 1];
			}
			
			sum = (arr[N] + arr[N - 1]) * 2 + (arr[N - 2] + arr[N - 1]) * 2;
		}
		else {
			sum = 4;
		}
		
		
		System.out.println(sum);
	}

}
