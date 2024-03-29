package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_15657 {

	static int N, M;
	static int[] arr, printArr;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N];
		printArr = new int[M];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		dfs(0,0);
	}
	
	static void dfs(int start, int depth) {
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(printArr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = start; i < N; i++) {
			printArr[depth] = arr[i];
			dfs(i, depth + 1);
		}
	}

}
