package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_0 {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int len = Integer.parseInt(br.readLine());
			
			char[][] arr = new char[8][8];
			
			for(int i = 0; i < 8; i++) {
				String s = br.readLine();
				for(int j = 0; j < 8; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			
			int cnt = 0;
			
			// 가로
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8 - len + 1; j++) {
					boolean flag = true;
					for(int k = 0; k < len; k++) {
						if(arr[i][k+j] != arr[i][len-k+j-1]) {
							flag = false;
							break;
						}
					}
					if(flag) cnt++;
				}
			}
			
			// 세로
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8 - len + 1; j++) {
					boolean flag = true;
					for(int k = 0; k < len; k++) {
						if(arr[k+j][i] != arr[len-k+j-1][i]) {
							flag = false;
							break;
						}
					}
					if(flag) cnt++;
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
			
		}
		
		System.out.println(sb.toString());

	}

}
