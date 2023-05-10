package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1970 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int[] result = new int[8];
			
			sb.append("#"+tc).append("\n");
			for(int i = 0; i < money.length; i++) {
				result[i] = N / money[i];
				N %= money[i];
				sb.append(result[i]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
