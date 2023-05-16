package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1208 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int[] arr = new int[100];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < 100; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			for(int i = 0; i < N; i++) {
				arr[0]++;
				arr[99]--;
				Arrays.sort(arr);
			}
			
			int tmp = arr[99] - arr[0];
			
			sb.append("#"+tc+" "+tmp).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
