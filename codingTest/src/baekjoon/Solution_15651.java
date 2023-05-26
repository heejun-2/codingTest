package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_15651 {

	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		dfs(0);
		System.out.println(sb.toString());
	}

	private static void dfs(int depth) {
		// TODO Auto-generated method stub
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}

}
