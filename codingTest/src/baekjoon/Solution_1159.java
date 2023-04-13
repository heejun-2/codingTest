package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1159 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[26];
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			
			arr[s.charAt(0)-97]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 5) {
				count++;
				char ch = (char)(i+97);
				sb.append(ch);
			}
		}
		
		if(count == 0) {
			System.out.println("PREDAJA");
		}else {
			System.out.println(sb.toString());
		}
	}

}
