package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1292 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[1001];
		
		int num = 1;
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(num == 1001) break;
				arr[num] = i;
				num++;
			}
		}
		
		int sum = 0;
		
		for(int i = A; i <= B; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		
		
	}

}
