package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1015 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		int[] order = new int[N];
		boolean[] visited = new boolean[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < N; i++) {
			int min = Integer.MAX_VALUE;
			int minidx = -1;
			
			for(int j = 0; j < N; j++) {
				if(visited[j]) continue;
				
				if(min > arr[j]) {
					min = arr[j];
					minidx = j;
				}
			}
			
			order[minidx] = i;
			visited[minidx] = true;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(order[i] + " ");
		}

	}

}
