package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1094 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int stick = 64;
		int cnt = 0;
		
		while(X > 0) {
			if(stick > X) {
				stick /= 2;
			}
			else {
				cnt++;
				X -= stick;
			}
		}
		
		System.out.println(cnt);

	}

}
