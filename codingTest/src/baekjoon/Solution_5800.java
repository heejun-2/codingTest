package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_5800 {
	// 성적 통계
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= N; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int K = Integer.parseInt(st.nextToken());
			int[] score = new int[K];
			int[] gap = new int[K-1];
			
			for(int i = 0; i < K; i++) {
				score[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(score);
			
			for(int i = 0; i < gap.length; i++) {
				gap[i] = score[i+1] - score[i];
			}
			
			Arrays.sort(gap);
			
			sb.append("Class "+tc).append("\n");
			sb.append("Max "+score[K-1]+", "+"Min "+score[0]+", "+"Largest gap "+gap[K-2]).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
