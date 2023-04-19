package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String[] arr = new String[5];
		
		int maxLength = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = br.readLine();
			// 최대 길이 구하기
			maxLength = Math.max(maxLength, arr[i].length());
		}
		
		for(int i = 0; i < maxLength; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j].length()-1 >= i) {
					sb.append(arr[j].charAt(i));
				}
			}
		}
		
		System.out.println(sb.toString());
	}

}
