package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_7087 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			int[] arr = new int[26];
			
			for(int i = 0; i < N; i++) {
				String s = br.readLine();
				int tmp = s.charAt(0) - 65;
				arr[tmp] = 1;
			}
			
			int cnt = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == 1) {
					cnt++;
				}else {
					break;
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
