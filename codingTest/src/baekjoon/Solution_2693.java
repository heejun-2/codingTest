package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2693 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10];
		
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			System.out.println(arr[arr.length-3]);
		}
		
		
	}

}
