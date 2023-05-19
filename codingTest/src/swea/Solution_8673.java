package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_8673 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int K = Integer.parseInt(br.readLine());
			
			LinkedList<Integer> l = new LinkedList<>();
			
			st = new StringTokenizer(br.readLine(), " ");
			
			while(st.hasMoreTokens()) {
				l.add(Integer.parseInt(st.nextToken()));
			}
			
			int sum = 0;
			
			for(int i = 0; i < Math.pow(2, K) - 1; i++) {
				int x = l.poll();
				int y = l.poll();
				sum += Math.abs(x - y);
				l.add(Math.max(x, y));
			}
			
			sb.append("#"+tc+" "+sum).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
