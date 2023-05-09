package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1984 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int[] arr = new int[10];
			
			st = new StringTokenizer(br.readLine(), " ");
			
			double sum = 0;
			for(int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			
			Arrays.sort(arr);
			
			sum -= arr[0] + arr[9];
			
			int avg = (int)Math.round(sum / 8);
			
			sb.append("#"+tc+" "+avg).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
