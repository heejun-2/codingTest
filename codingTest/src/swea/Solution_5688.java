package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_5688 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			long N = Long.parseLong(br.readLine());
			long i = 1;
			long result = -1;
			
			while(i * i * i <= N) {
				if(i * i * i == N) {
					result = i;
					break;
				}
				i++;
			}
			
			sb.append("#"+tc+" "+result).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
