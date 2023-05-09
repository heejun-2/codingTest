package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1983 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] score = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			double[] arr = new double[N];
			
			double tmp = 0;
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				arr[i] = Integer.parseInt(st.nextToken()) * 0.35 + Integer.parseInt(st.nextToken()) * 0.45 + Integer.parseInt(st.nextToken()) * 0.2;
				if(i+1 == K) tmp = arr[i];
			}
			
			Arrays.sort(arr);
			
			int order = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == tmp) order = i;
			}
			
			sb.append("#"+tc+" "+score[order / (N / 10)]).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
