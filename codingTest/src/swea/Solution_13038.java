package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_13038 {
	// 교환학생
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[7];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < 7; i++) {
				if(arr[i] == 1) {
					int start = i;
					int cnt = 0;
					
					while(true) {
						if(arr[start % 7] == 1) {
							cnt++;
						}
						
						start++;
						
						if(cnt == n) {
							min = Math.min(min, start - i);
							break;
						}
					}
				}
			}
			
			sb.append("#"+tc+" "+min).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
