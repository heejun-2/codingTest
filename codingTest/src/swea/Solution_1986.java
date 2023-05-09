package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1986 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int sum = 0;
			
			for(int j = 1; j <= N; j++) {
				if(j % 2 == 0) {
					sum -= j;
				}else {
					sum += j;
				}
			}
			sb.append("#"+i+" "+sum).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
