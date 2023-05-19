package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6692 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			double p = 0;
			int x = 0;
			
			double sum = 0;
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				
				p = Double.parseDouble(st.nextToken());
				x = Integer.parseInt(st.nextToken());
				
				sum += p * x;
			}
			
			
			sb.append("#"+tc+" "+sum).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
