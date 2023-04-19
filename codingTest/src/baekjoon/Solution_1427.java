package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String s = br.readLine();
		
		char[] arr = s.toCharArray();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		
		System.out.println(sb.reverse().toString());
		
	}

}
