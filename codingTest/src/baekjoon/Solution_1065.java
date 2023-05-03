package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		
		if(N < 100) {
			cnt = N;
		}
		
		else {
			cnt = 99;
			
			for(int i = 100; i <= N; i++) {
				String s = i+"";
		
				int minus = s.charAt(1) - s.charAt(0);
				boolean pass = true;
				
				for(int j = 2; j < s.length(); j++) {
					int tmp = s.charAt(j) - s.charAt(j-1);
					if(tmp != minus) {
						pass = false;
						break;
					}
				}
				
				if(pass) {
					cnt++;
				}
			}
			
		}

		System.out.println(cnt);

	}

}
