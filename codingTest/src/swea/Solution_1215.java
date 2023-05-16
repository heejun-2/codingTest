package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1215 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			
			char[][] arr = new char[8][8];
			
			for(int i = 0; i < 8; i++) {
				String s = br.readLine();
				for(int j = 0; j < 8; j++) {
					arr[i][j] = s.charAt(j);
				}
			}
			
			int cnt = 0;
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8 - N + 1; j++) {
					String s = "";
					for(int k = 0; k < N; k++) {
						s += arr[i][j+k];
					}
					
					boolean isPass = true;
					
					for(int l = 0; l < N / 2; l++) {
						if(s.charAt(l) != s.charAt(N - l - 1)) {
							isPass = false;
							break;
						}
					}
					
					if(isPass) cnt++;
					
				}
			}
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8 - N + 1; j++) {
					String s = "";
					for(int k = 0; k < N; k++) {
						s += arr[j+k][i];
					}
					
					boolean isPass = true;
					
					for(int l = 0; l < N / 2; l++) {
						if(s.charAt(l) != s.charAt(N - l - 1)) {
							isPass = false;
							break;
						}
					}
					
					if(isPass) cnt++;
					
				}
			}
			
			sb.append("#"+tc+" "+cnt).append("\n");
		}
		
		System.out.println(sb.toString());

	}

}
