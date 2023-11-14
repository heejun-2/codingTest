package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11688 {
	// Calkin-Wilf tree 1
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			int[] arr = {1, 1};
			String s = br.readLine();
			for(char c : s.toCharArray()) {
				if(c == 'L') {
					int tmp = arr[1];
					arr[1] = arr[0] + tmp;
				}
				else {
					int tmp = arr[0];
					arr[0] = tmp + arr[1];
				}
			}
			
			sb.append("#"+tc+" "+arr[0]+" "+arr[1]).append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
