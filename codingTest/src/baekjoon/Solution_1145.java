package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1145 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[5];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int result = arr[0];
		
		while(true) {
			int cnt = 0;
			
			for(int i = 0; i < 5; i++) {
				if(result % arr[i] == 0) {
					cnt++;
				}
			}
			
			if(cnt >= 3) {
				break;
			}
			
			result++;
		}
		
		System.out.println(result);

	}

}
