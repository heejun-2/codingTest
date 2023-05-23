package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5515 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] day = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] a = {4, 5, 6, 0, 1, 2, 3};
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int sum = 0;
			
			for(int i = 1; i < m; i++) {
				sum += day[i];
			}
			
			sum += d - 1;
			
			sb.append("#"+tc+" "+a[sum%7]).append("\n");
			
		}
		
		System.out.println(sb.toString());
	}

}
