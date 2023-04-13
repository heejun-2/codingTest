package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_2309 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int sum = 0;
		int A = 0;
		int B = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					A = arr[i];
					B = arr[j];
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == A || arr[i] == B) {
				continue;
			}
			System.out.println(arr[i]);
		}
	}

}
