package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1012 {
	static int M, N, K;
	
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	static int[][] arr;
	static boolean[][] visit;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			arr = new int[M][N];
			visit = new boolean[M][N];
			
			for(int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				
				arr[X][Y] = 1;
			}
			
			int cnt = 0;
			
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j] == 1 && !visit[i][j]) {
						dfs(i,j);
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);
			
			
		}

	}

	private static void dfs(int i, int j) {
		// TODO Auto-generated method stub
		visit[i][j] = true;
		
		for(int k = 0; k < 4; k++) {
			int ni = i + dr[k];
			int nj = j + dc[k];
			
			if(ni >= 0 && nj >= 0 && ni < M && nj < N) {
				if(arr[ni][nj] == 1 && !visit[ni][nj]) {
					dfs(ni, nj);
				}
			}
		}
	}

}
