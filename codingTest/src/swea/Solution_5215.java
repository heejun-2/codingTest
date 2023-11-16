package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5215 {
	// 햄버거 다이어트
	
	static int N, L, max;
	static int[] score;
	static int[] kcal;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			
			score = new int[N];
			kcal = new int[N];
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				score[i] = Integer.parseInt(st.nextToken());
				kcal[i] = Integer.parseInt(st.nextToken());
			}
			
			max = 0;
			combination(0, 0, 0);
			
			sb.append("#"+tc+" "+max).append("\n");
		}
		
		System.out.println(sb.toString());

	}
	
	static void combination(int cnt, int sum, int cal) {
		if(cal > L) return;
		if(cal <= L) max = Math.max(max, sum);
		if(cnt == N) return;
		
		combination(cnt + 1, sum + score[cnt], cal + kcal[cnt]);
		combination(cnt + 1, sum, cal);
	}

}
