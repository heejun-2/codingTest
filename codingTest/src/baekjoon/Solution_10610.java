package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_10610 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		int[] arr = new int[s.length()];
		
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i) - '0';
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		if(arr[0] != 0 || sum % 3 != 0) {
			sb.append(-1);
		}
		else {
			for(int i = s.length() - 1; i >= 0; i--) {
				sb.append(arr[i]);
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
