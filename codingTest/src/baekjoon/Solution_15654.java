package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_15654 {

	static int[] arr;
	static int[] result;
	static int N;
	static int M;
	static boolean[] isVisited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		result = new int[N];
		
		isVisited = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		dfs(0);
		System.out.println(sb.toString());
		
	}

	private static void dfs(int cnt) {
		// TODO Auto-generated method stub
		if(cnt == M) {
			for(int i = 0; i < M; i++) {
				sb.append(result[i]).append(" " );
			}
			sb.append("\n");
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!isVisited[i]) {
				isVisited[i] = true;
				result[cnt] = arr[i];
				dfs(cnt + 1);
				isVisited[i] = false;
			}
		}
	}

}
