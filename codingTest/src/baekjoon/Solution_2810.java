package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2810 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String s = br.readLine();
		
		int cnt = 1;
		
		for(int i = 0; i < N; i++) {
			char ch = s.charAt(i);
			
			if(ch == 'S') {
				cnt++;
			}
			else if(ch == 'L') {
				i++;
				cnt++;
			}
		}
		
		if(cnt > N) {
			System.out.println(N);
		}else {
			System.out.println(cnt);
		}

	}

}
