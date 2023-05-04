package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1475 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		int N = Integer.parseInt(br.readLine());
		
		while(N > 0) {
			int tmp = N % 10;
			
			if(tmp == 9) {
				arr[6]++;
			}else {
				arr[tmp]++;
			}
			
			N /= 10;
		}
		
		if(arr[6] % 2 == 0) {
			arr[6] /= 2;
		}else {
			arr[6] = (arr[6] + 1) / 2;
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[8]);

	}

}
