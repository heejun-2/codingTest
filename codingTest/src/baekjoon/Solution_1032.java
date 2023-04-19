package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1032 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		char[] arr = br.readLine().toCharArray();
		
		for(int i = 0; i < N - 1; i++) {
			char[] check = br.readLine().toCharArray();
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] != check[j]) {
					arr[j] = '?';
				}
			}
			
		}

		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb.toString());
	}

}
