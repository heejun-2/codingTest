package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_12004 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int a = 0;
			int b = 0;
			boolean isPass = false;
			
			for(int i = 1; i <= 9; i++) {
				if(N % i == 0) {
					a = i;
					b = N / i;
					if(b >= 1 && b <= 9) {
						isPass = true;
						break;
					}
				}
			}
			
			sb.append("#"+tc+" ");
			if(isPass) {
				sb.append("Yes");
			}else {
				sb.append("No");
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
