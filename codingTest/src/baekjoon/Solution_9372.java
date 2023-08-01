package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_9372 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
			}
			
			sb.append(N-1).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
