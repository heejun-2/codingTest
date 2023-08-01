package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_2822 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[8][2];
		int[] result = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 8; i++) {
			arr[i][0] = Integer.parseInt(br.readLine());
			arr[i][1] = i + 1;
		}
		
		Arrays.sort(arr, (int[] a, int[] b) -> {
			return b[0] - a[0];	// 내림차순 정렬
		});
		
		for(int i = 0; i < 5; i++) {
			sum += arr[i][0];
			result[i] = arr[i][1];
		}
		
		Arrays.sort(result);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(sum).append("\n");
		for(int i = 0; i < 5; i++) {
			sb.append(result[i]).append(" ");
		}
		
		System.out.println(sb.toString());

	}

}
