package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2606 {

	static boolean[] check;
	static int[][] arr;
	static int cnt = 0;
	static int node, line;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		node = Integer.parseInt(br.readLine());
		line = Integer.parseInt(br.readLine());
		
		arr = new int[node+1][node+1];
		check = new boolean[node+1];
		
		
		StringTokenizer st;
		
		for(int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
			
		}
		
		dfs(1);
		
		
		System.out.println(cnt-1);

	}
	
	public static void dfs(int start) {
		check[start] = true;
		cnt++;
		
		for(int i = 1; i <= node; i++) {
			if(arr[start][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}

}
