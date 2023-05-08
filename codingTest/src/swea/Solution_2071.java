package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2071 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1; i <= T; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j = 0; j < 10; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			System.out.println("#"+i+" "+Math.round((double)sum / 10));
		}

	}

}
