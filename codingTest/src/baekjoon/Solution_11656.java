package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_11656 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		String[] arr = new String[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.substring(i);
		}
		
		Arrays.sort(arr, (s1, s2) -> {
			return s1.compareTo(s2);
		});
		
		for(int i = 0; i < s.length(); i++) {
			System.out.println(arr[i]);
		}

	}

}
