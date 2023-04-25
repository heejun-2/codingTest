package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2851 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			sum += arr[i];
			
			if(Math.abs(sum - arr[i] - 100) < sum-100 ) {
				sum -= arr[i];
				break;
			}
		}
		
		System.out.println(sum);
	}

}
