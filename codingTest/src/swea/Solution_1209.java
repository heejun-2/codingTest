package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1209 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[100][100];
			
			for(int i = 0; i < 100; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int max = Integer.MIN_VALUE;
			
			int sum1 = 0;
			int sum2 = 0;
			
			for(int i = 0; i < 100; i++) {
				sum1 = 0;
				sum2 = 0;
				for(int j = 0; j < 100; j++) {
					sum1 += arr[i][j];
					sum2 += arr[j][i];
				}
				if(sum1 > max) max = sum1;
				if(sum2 > max) max = sum2;
			}

			
			sum1 = 0;
			sum2 = 0;
			
			for(int i = 0; i < 100; i++) {
				sum1 += arr[i][i];
				sum2 += arr[i][100 - i - 1];
			}
			if(sum1 > max) max = sum1;
			if(sum2 > max) max = sum2;
			
			
			sb.append("#"+tc+" "+max).append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
