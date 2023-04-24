package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_4796 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		int num = 1;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			if(L == 0 && P == 0 && V == 0) {
				break;
			}
			
			int tmp = V / P;
			
			sb.append("Case "+num+": "+(L * tmp + Math.min(L, V % P))).append("\n");
			num++;
		}
		
		System.out.println(sb.toString());
		
	}

}
