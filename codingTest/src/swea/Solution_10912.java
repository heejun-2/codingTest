package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_10912 {
	// 외로운 문자
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			int[] arr = new int[26];
			String s = br.readLine();
			
			for(int i = 0; i < s.length(); i++) {
				int idx = s.charAt(i) - 97;
				arr[idx]++;
			}
			
			boolean flag = true;
			sb.append("#"+tc+" ");
			for(int i = 0; i < 26; i++) {
				if(arr[i] % 2 != 0) {
					flag = false;
					sb.append((char)(i + 97));
				}
			}
			
			if(flag) sb.append("Good");
			sb.append("\n");
			
			
		}
		
		System.out.println(sb.toString());
	}

}
